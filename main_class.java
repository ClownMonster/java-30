import java.util.*;

abstract class vehicle{
  Scanner sc = new Scanner(System.in);
  int year ;
    vehicle(final int y) {
    year = y;
  }

  abstract void getdata();

  abstract void putdata();
}

class twowheeler extends vehicle {

  String type; Scanner sc = new Scanner(System.in);
  int tyre;
  twowheeler(int y, int t) {
    super(y);
    tyre = t;

  }

  void getdata() {
    System.out.println("Enter the type of the vehicle : ");
    type = sc.nextLine();
  }

  void putdata() {
    System.out.println("Vehcle details : ");
    System.out.println("year : " + year);
    System.out.println("type : " + type);
    System.out.println("tyre : " + tyre);

  }

}

class fourwheeler extends vehicle {
  int weight, height;
  Scanner sc = new Scanner(System.in);
  fourwheeler(final int y, final int w) {
    super(y);
    weight = w;
    
  }

  void getdata(){
    System.out.println("ENter the height of the vehicle : ");
    height = sc.nextInt();
  }

  void putdata()
  {
    System.out.println("Vehcle details : ");
    System.out.println("year : " + year);
    System.out.println("height : "+height);
    System.out.println("weight  : " +weight );
  }

}

class mytwowheeler extends twowheeler{
  int engno;
  String color;
  Scanner sc = new Scanner(System.in);
  mytwowheeler(int y, int t, int n) {
    super(y, t);
    engno = n;
    
  }

  void getdata()
  {
    System.out.println("Enter the color of the vehicle : ");
    color = sc.nextLine();
  }

  void putdata()
  {
    System.out.println("Vehcle details : ");
    System.out.println("year : " + year);
    System.out.println("tyre : " + tyre);
  }
  
  
}


public class main_class{

  public static void main(String args[]) {
    int year ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year of manufacture : ");
    year = sc.nextInt();
    System.out.println("Enter the tyre of the vehicle : ");
    int tyre = sc.nextInt();
    System.out.println("Enter the engine number : ");
    int n  = sc.nextInt();
    mytwowheeler ob1 = new mytwowheeler(year, tyre,n);
    ob1.getdata();
    ob1.putdata();
    
  }

}