package com.ConditionWithSemicolon;

import java.util.Scanner;

public class ConditionWithSemicolon {

	public static void main(String[] args) {
		int x;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the x value:");
	    x=sc.nextInt();
	    if(x<0)
	    {
	    	System.out.println("invalid input");
	    }
	    else if (x > 0)
	    {
	                System.out.println("x is greater than ");
	    }
	     else {
	                System.out.println("x is not greater than ");
	    System.out.println("This statement will only be executed if the condition is false.");
	     }



	}

}
