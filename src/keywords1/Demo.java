package keywords1;

public class Demo {
	//Using this keyword to invoke the current class instance method
	public void display() {
		System.out.println("-----------display()-----------");
		System.out.println("Displaying the details..");
		this.show();
	}

	public void show() {
		System.out.println("-----------show()-----------");
		System.out.println("Showing the details..");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		
	}

}
