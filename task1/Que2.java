package task1;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
System.out.println("enter a number:");
int number=obj.nextInt();

if(number<0) {
	System.out.println("given number is negative"+number);
}
else if(number>0){
	System.out.println("given number is positive"+number);
}
else {
	System.out.println("give number is neither positive nor negative");
}

	}

}
