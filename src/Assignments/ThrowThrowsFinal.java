package Assignments;

public class ThrowThrowsFinal {
	public void finallyBlock() {
		int a=45,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + rs);
        }
	}
	
	public void throwMethod() {

        int a=45,b=0,rs;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
	}
	void throwsMethod() throws ArithmeticException
    {
        int a=45,b=0,rs;
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }
	public static void main(String[] args) {
		ThrowThrowsFinal T = new ThrowThrowsFinal();
		
		System.out.println("throw example");
		T.throwMethod();
		
		System.out.println("\nFinally block example");
		T.finallyBlock();
		
		System.out.println("\nThrows example");		
        try
       {
           T.throwsMethod();
       }
       catch(ArithmeticException Ex)
       {
           System.out.print("\n\tError : " + Ex.getMessage());
       }
       System.out.print("\n\tEnd of program.");

	}

}
