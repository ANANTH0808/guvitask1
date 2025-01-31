package demo;

import java.util.Scanner;

public class Patternewtry {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	       int i,j,k;
	       System.out.println("Enter number of rows");
	       k=obj.nextInt();
	     
	       for(i=k;i>=1;i--)
	       {
	           for(j=k;j>=1;j--)
	           {
	               System.out.print(i>j?i:j);
	           }
	           System.out.println();
	       }
	     
	     
	     }
	

	}


