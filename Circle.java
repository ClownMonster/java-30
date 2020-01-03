import java.util.*;


class Circle
{ 
  static Scanner sc = new Scanner(System.in); /* static variable so that it can be access outside the class */
  public static void main(String args[])
  {
    int ch;
    
    while(true)
    {
      System.out.print("1.Radius\n2.Sector\n3.Segment\n4.exit\nEnter your Choice : ");
      ch = sc.nextInt();
      switch(ch)
      {
        case 1: System.out.println("\nEnter the radius of the radius"); 
                radius ob1 = new radius(sc.nextDouble()); /* object for class radius */
                System.out.println("Area : "+ ob1.area());
                break;
        case 2: System.out.println("\nEnter the radius and angle of the radius");
                Double r = sc.nextDouble();
                Double a = sc.nextDouble();
                sector ob2 = new sector(r,a);
                System.out.println("Area : " + ob2.area());
                break;
        case 3: System.out.println("\nEnter the radius and length of the radius");
                Double r2 = sc.nextDouble();
                Double l = sc.nextDouble();
                segment ob3 = new segment(r2,l);
                System.out.println("Area : " + ob3.area());
                break;
        case 4: System.exit(0);

        default: System.out.println("\nInvallid choice");
                break;

      }

    }
    
   
  }
 
}

class radius{ /* extendable class */
  Double r;
  radius(Double r) /* main constructor */
  {
    this.r = r;
  }

  Double area() /* common method */
  {
    return 3.14*r*r;
  }

}

class sector extends radius{ /* sector class extending main class */
  Double a;
  sector(Double r, Double a)
  {
    super(r); /* parent data */
    this.a = a;
  }

  Double area() 
  {
    return (0.5*r*r*a);
  }
}

class segment extends radius {
  Double  l;

  segment(Double r, Double l) 
  {
    super(r); /* parent data */
    this.l = l;
  }

  Double area()
   {
    return (r*r*((r-l)/r)-(r-l)*Math.sqrt(2*r*l-(l*l)));
  }
}
