package Assignments;
class CustomizeException  extends Exception  
{  
    public CustomizeException (String str)  
    {  
        super(str);  
    }  
}  

public class TryCatchCustom  
{  
	static void validate (int age) throws CustomizeException{    
       if(age < 18){  
    	   throw new CustomizeException("age is not valid to vote");    
       }  
       else {   
        System.out.println("welcome to vote");   
       }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {  
            validate(13);  
        }  
        catch (CustomizeException ex)  
        {  
            System.out.println("Caught the exception");  
    
            System.out.println("\nException occured: " + ex);  
        }  
        System.out.println("\nThe code is still running");    
    }  
}  
