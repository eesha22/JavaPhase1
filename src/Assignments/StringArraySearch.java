package Assignments;

import java.util.Scanner;

public class StringArraySearch {
	
	public void sarch1(String sts) {
		 String[] strArray = { "Ani", "Sam", "Joe" }; 
		 System.out.println("The array string is :\n");
		 for (int i = 0; i < strArray.length; i++) {
			 System.out.print(strArray[i]+" ");}
         boolean x = false;  
         int in = 0;  
         String s = sts;  
         for (int i = 0; i < strArray.length; i++) {  
             if(s.equals(strArray[i])) {  
                 in = i; 
                 x = true; 
                 break;  
             }  
         }  
         if(x)  {
        	 System.out.println("\n");
             System.out.println(s +" String is found at index "+in);}  
         else {  
        	 System.out.println("\n");
             System.out.println(s +" String is not found in the array");}
	}

	public static void main(String[] args) {
		
		StringArraySearch ss = new StringArraySearch();
		System.out.println("Enter a string to search");
		Scanner sc = new Scanner(System.in);
		String sts = sc.nextLine();
		ss.sarch1(sts);

	}

}
