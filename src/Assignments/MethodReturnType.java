package Assignments;

public class MethodReturnType {
	//primitive return data type
	int square(int num){
	   return num * num; 
	 }
	float add(int num){
		   return num + num; 
		 }
	double square_add(int num){
		   return (num * num)+num; 
		 }
	public static void main(String[] args) 
	{
	   MethodReturnType t = new MethodReturnType();
	   int squares = t.square(20); 
	   float adding= t.add(20); 
	   double square_add_ing = t.square_add(20); 
	   System.out.println("Square of 20: " +squares);
	   System.out.println("Addition of 20: " +adding);
	   System.out.println("Squaring and then adding of 20: " +square_add_ing);
	  }
}
