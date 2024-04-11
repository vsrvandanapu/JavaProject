package exception.handling.finallyex;

public class Test3 {
	// Exception occurs and not handled
		public static void main(String[] args) {
			System.out.println("Starting");
			int n = 10;
			try {
				System.out.println(n/0);
			}
			catch(NumberFormatException nfe) {
				System.out.println("Execption is handled..");
			}
			finally{
				System.out.println("Executing the finally block");
			}
			System.out.println("Ending");
			

		}
}
