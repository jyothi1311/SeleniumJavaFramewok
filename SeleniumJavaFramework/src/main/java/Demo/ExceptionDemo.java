package Demo;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
		System.out.println("Hello world ...");
		int i=1/0;
		
		System.out.println("completed");
	}
   catch(Exception exp)
   {
	 //  System.out.println("Hello world...");
	   System.out.println("Message is.."+exp.getMessage());
	   System.out.println("cause is..."+exp.getCause());
	   exp.printStackTrace();	   
   }
	
	finally
	{
		System.out.println("I am inside a finally block ");
	}
	   
   }
}
