package Assignments;

import java.util.Scanner;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Implicit Type Casting\n");
		
		System.out.println("Enter the string : ");
		String word = sc.nextLine();
		
		System.out.println("Value of a as string: "+word);
		
		int a=Integer.parseInt(word);
		System.out.println("Value of b as integer: "+a);
		
		float b=Float.parseFloat(word);
		System.out.println("Value of c as float: "+b);
		
		long c=Long.parseLong(word);
		System.out.println("Value of d as long int: "+c);
		
		double d=Double.parseDouble(word);
		System.out.println("Value of e as float double: "+d);
	
	}

}
