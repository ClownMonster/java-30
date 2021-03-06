import java.util.*;

class matrix{

	static Scanner sc =  new Scanner(System.in); /* Scanner object to get the user input.. static since it can be accessed in static methods */
	int A[][], B[][], C[][]; 

	matrix(int r1 , int c1, int r2, int c2) /* constructor to initalize the matrix */
	{  

		A =  new int[r1][c1];
		B =  new int[r1][c2];
		C =  new int[r1][c2];
	}


	void matrix1_input(int row1, int col1) /* intaking elements for first matrix */
	{
		System.out.println("\nEnter the Elements of the first matrix : ");
		for(int i=0; i< row1; i++)
		{
			for(int j=0; j<col1;j++)
			A[i][j] = sc.nextInt();
		}
	}

	void matrix2_input(int row2, int col2) /* intaking elements for second matrix */
	{
		System.out.println("Enter the Elements of the first matrix : ");
		for(int i=0; i< row2; i++)
		{
			for(int j=0; j<col2;j++)
			B[i][j] = sc.nextInt();
		}
	}


	void Multiply(int r1, int c1, int r2 , int c2)  /* method for matrix multiplication */
	{  int sum;
		for(int i = 0; i<r1;i++)
		{
			for(int j = 0; j<c2;j++)
			{   sum = 0;  // re-initialization to zero after eacch iteration */
				for(int k = 0;k<r2;k++)
					sum  = sum + (A[i][k]*B[k][j]);

			C[i][j] = sum;
			}
 
			
		}
	}


	void Print_matrix(int r1 , int c2) /* method to print Elements of the resultant matrix */
	{

		System.out.println("The Resultant Matrix is : ");
		for(int i = 0; i<r1; i++)
		{
			for(int j = 0; j < c2; j++)
				System.out.print(C[i][j]+" ");

			System.out.print("\n");
	}
		}
		


	public static void main(String args[])
	{

		System.out.println("******Matrix MUltiplication*******");
	    while(true)
		{
				System.out.print("1.\nPerform MUltiplication\n2.Exit the Portal\n\nEnter your choice :");
				int choice  = sc.nextInt();
				if(choice == 2) System.exit(0);
			    System.out.print("\nEnter the order of first matrix : ");
				int row1 = sc.nextInt();
				int col1 = sc.nextInt();
				System.out.print("\nEnter the order of Second matrix : ");
				int row2 = sc.nextInt();
				int col2 = sc.nextInt();

				if(col1 != row2) /* condition to check whether the multiplication is possible */
				{
					System.out.println("\nMatrix multiplication Not Posiible\n Enter the Correct order of the matrixes");
					break;
				}

				else
				{
					switch(choice)
					{
						case 1:  matrix ob = new matrix(row1,col1,row2,col2); /* creating the object for the class and calling the constructor to initialize the matrix */
								 ob.matrix1_input(row1, col1); /* call for intaking first matrix elements *?
								 ob.matrix2_input(row2, col2); /* call for intaking second matrix elements *?
								 ob.Multiply(row1,col1,row2,col2); /* calling the method to perform multiplication */
								 ob.Print_matrix(row1,col2); /* method call to print the the resultant matrix */
								 break;

					    default : System.out.println("Invalid choice");
					              break;
					}
				}



	    }

	}




}
