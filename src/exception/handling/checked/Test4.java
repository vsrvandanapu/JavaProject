package exception.handling.checked;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("Begining");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("InProgress");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending");

	}

}
