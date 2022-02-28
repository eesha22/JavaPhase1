package practiceProject;

import java.util.Scanner;
public class Calculator {
	char operator;
    int num1, num2, result;
    boolean runprogram = true;
    	
	public void calculate() {		
		Scanner input = new Scanner(System.in);    	
	    System.out.print("Enter first number ");
	    num1 = input.nextInt();
	    System.out.print("Choose an operator: +, -, *, or / ");
	    operator = input.next().charAt(0);
	    System.out.print("Enter second number ");
	    num2 = input.nextInt();
	    switch (operator) {
	      case '+':{
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result + "\n");
	        break;}
	      case '-':{
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result + "\n");
	        break;}
	      case '*':{
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result + "\n");
	        break;}
	      case '/':{
	        System.out.println(num2 + " / " + num1 + " = " + num2/num1 + "\n");
	        break;}	    	  
	      default:{
	        System.out.println("Invalid operator!");
	        break;}
	    }	
	}
	public void repeat() {		
		Calculator c = new Calculator();
		do {
		c.calculate();
		System.out.print("Please enter 'e' to exit or 'c' to continue the program.");
		Scanner sc = new Scanner(System.in);
		char exit = sc.next().charAt(0);
		if(exit == 'e') {
			System.out.println("Exiting program");
			runprogram = false;
			System.exit(0);}
		else if(exit=='c'){continue;}
		}while (runprogram == true);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.repeat();
		}
}
