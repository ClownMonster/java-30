from flask import Flask,request
from flask import render_template
from flask_socketio import SocketIO


app = Flask(__name__)
app.config['SECRETE_KEY'] = "ljhjasjkafhjda"


socketio = SocketIO(app)
@app.route('/')
def index():
  return render_template("index.html")


def messagereciever(methods = ["GET", "POST"]):
  print("message was recieved")

@socketio.on('my-event')
def handle_my_custom_event(json, methods = ["GET", "POST"]):
  print('received my event: ' + str(json))
  socketio.emit('my response', json, callback=messageReceived)



if __name__ == '__main__':
   socketio.run(app, debug = True)
