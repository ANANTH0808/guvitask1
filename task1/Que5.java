package task1;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a parchased amount:");
    	double parchaseamount=obj.nextDouble();        
         double amount;
         if(parchaseamount<500 && parchaseamount>1000) {
        	 amount=parchaseamount-parchaseamount*10/100;
         }
         else if(parchaseamount>1000) {
        	 amount=parchaseamount-parchaseamount*20/100;
         }
         else { 
        	 amount=parchaseamount;
         }
         System.out.println("total amount to be paid after discound : "+amount);
	}

}
