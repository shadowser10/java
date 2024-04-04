import java.io.*;
import java.util.*;
class Matrix
{
	public static void main(String st[])
	{
	  int a[][]=new int[10][10],b[][]=new int[10][10],c[][]=new int[10][10];
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter no of rows and column of 1st ");
	  int r1=sc.nextInt();
	  int c1=sc.nextInt();
	 
	  System.out.println("Enter no of rows and column of 2nd ");
	  int r2=sc.nextInt();
	  int c2=sc.nextInt();
	  
	  if(c1==r2)
	  {
	  	 System.out.println("Enter elements of 1st matrix");
		  for(int i=0;i<r1;i++)
		  {
		  	for(int j=0;j<c1;j++)
		  		a[i][j]=sc.nextInt();
		  }
	  	System.out.println("Enter elements of 2nd matrix ");
		for(int i=0;i<r2;i++)
		  {
		  	for(int j=0;j<c2;j++)
		  		b[i][j]=sc.nextInt();
		  }
	  	for(int i=0;i<r1;i++)
	  		for(int j=0;j<c2;j++)
	  			for(int k=0;k<r2;k++)
	  			{
	  				c[i][j]+=a[i][k]*b[k][j];
	  			}
	  	System.out.println("Multipiled matrix:");
	  	for(int i=0;i<r1;i++)
	 	{
	  		for(int j=0;j<c2;j++){
	  			System.out.print(c[i][j] +"    ");
	  			}
	  		System.out.println();
	  	}
	  }
	  else
	  	 System.out.println("Multiplication is not posible");
	}
}
