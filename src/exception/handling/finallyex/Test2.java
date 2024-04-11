package exception.handling.finallyex;

public class Test2 {
	// Exception occurs and handled
		public static void main(String[] args) {
			System.out.println("Starting");
			int n = 10;
			try {
				System.out.println(n/0);
			}
			catch(ArithmeticException ae) {
				System.out.println("Execption is handled..");
			}
			finally{
				System.out.println("Executing the finally block");
			}
			
			System.out.println("Ending");

		}
}
