package task1;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {
		//int number =543;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=obj.nextInt();
		int revnumber=0;
		while(number!=0) {
			revnumber=revnumber*10+number%10;
			number=number/10;
			
		}
		System.out.println("The reverse of the number is :"+ revnumber);

	}

}
