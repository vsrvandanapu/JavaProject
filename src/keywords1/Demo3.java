package keywords1;

public class Demo3 {

	public void display() {
		System.out.println("-----------display()-----------");
		System.out.println("Displaying the details..");
		show();
	}

	public void show() {
		System.out.println("-----------show()-----------");
		System.out.println("Showing the details..");
	}

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.display();
		
	}

}
