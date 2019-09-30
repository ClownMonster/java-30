import java.util.*;
public class complex{

static Scanner sc = new Scanner(System.in);

  void add(Float r1, Float i1,Float r2,Float i2)
  {
   Float real = r1 + r2;
   Float img = i1 + i2 ;
   System.out.println("Reultant complex number:");
   System.out.println(real+" +i "+img);
  }

  void sub(Float r1, Float i1, Float r2, Float i2) {

    Float real = r1 - r2;
    Float img = i1 - i2;
    System.out.println("Reultant complex number:");
    System.out.println(real + " +i " + img);
  }


  void multi(Float r1, Float i1, Float r2, Float i2) {

    Float real = r1 * r2;
    Float img = i1 * i2;
    System.out.println("Reultant complex number:");
    System.out.println(real + " +i" + img + "\n");

  }

  void div(Float r1, Float i1, Float r2, Float i2) {

    if(r2 == 0 || i2 == 0)
    {
      System.out.println("Divsion error");
      return;
    }

    else{
    Float real = r1 / r2;
    Float img = i1 / i2;
    System.out.println("Reultant complex number:");
    System.out.println(real + " +i " + img);
    return;
    }

  }




    public static void main(String[] args)
    {

        while(true)
        {
          System.out.println("*******Complex Calci Menu*********");
          System.out.println("1.Addition\n1.Substraction\n3.Multiplication\n4.Division\n5.Terminate-Program");
          System.out.print("\nEnter Your Choice : ");
          int a = sc.nextInt();
          if(a==5)
          System.exit(0);
          System.out.print("\nEnter the real part of first complex number : ");
          Float r1 = sc.nextFloat();
          System.out.print("\nEnter the imaginary part of first complex number: ");
          Float i1 = sc.nextFloat();
          System.out.print("\nEnter the real part of second complex number : ");
          Float r2 = sc.nextFloat();
          System.out.print("\nEnter the imaginary part of first complex number : ");
          Float i2 = sc.nextFloat();
          complex ob = new complex();
          switch(a)
          {
            case 1: ob.add(r1,i1,r2,i2);
                    break;
            case 2: ob.sub(r1,i1,r2,i2);
                    break;
            case 3: ob.multi(r1,i1,r2,i2);
                    break;
            case 4 : ob.div(r1,i1,r2,i2);
                    break;          
            default : System.out.println("Invalid Choice");
                    break;

          }

        }


    }

}