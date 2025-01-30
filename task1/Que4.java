package task1;

import java.util.Scanner;

public class Que4 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number 1:");
		int number1=obj.nextInt();
		System.out.println("enter a number 2:");
		int number2=obj.nextInt();
		System.out.println("enter a number 3:");
		int number3=obj.nextInt();
		if(number1>number2 && number1>number3) {
			System.out.println("number 1 is greatest"+" "+number1);
		}
		else if(number2>number1&&number2>number3) {
			System.out.println("number 2 is greatest"+" "+number2);
		}else {
			System.out.println("number 3 is the greatest"+" "+number3);
		}
		
	}

}
