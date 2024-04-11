package exception.handling.finallyex;

public class Test1 {
	// Exception doesn't occur
		public static void main(String[] args) {
			System.out.println("Starting");
			int n = 10;
			try {
				System.out.println(n/2);
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
