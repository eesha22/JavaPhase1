package Assignments;

public class Constructor {
	//default constructor.
	Constructor(){
		System.out.println("Default Constructor");
	}
	
	//Parameterized Constructor
	Constructor(int a){
		System.out.println("\nParameterized Constructor value : "+a);
	}
	
	public static void main(String[] args) {
		
		Constructor def = new Constructor();
		
		Constructor par= new Constructor(12345);
		

	}

}
