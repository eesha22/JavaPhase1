package Assignments;
class A{  
	private int data=40;  
	private void msg(){System.out.println("Hello java");} 
	void msgdefault(){
		System.out.println("Hello I'm class A");}  
		}  
		  
public class AccessModifiersA { 
	public static void main(String args[]){  
		//Class A things cannot be accessed in another class as
		//it has been declared as private so it will thorw Compile Time Error  

	   /*A obj=new A();  
	   System.out.println(obj.data);
	   obj.msg();*/			 
	}  
}
