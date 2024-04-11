package oops.interface3;

public class ClsUsage {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~public static final variables~~~~~~~~");
		System.out.println("Course Name : " + Vehicle1.COURSE_NAME);
		System.out.println("Course Duration : " + Vehicle1.COURSE_DURATION);
		System.out.println("Institute Name : " + Vehicle2.INST_NAME);
		System.out.println("Course Fee : " + Vehicle2.COURSE_FEE);
		/*
		 To create an Object:
		 InterfaceName refVar = new ClassName();
		 */
		Vehicle2 b = new Bike();
		b.start();
		b.move();
		b.stop();
		System.out.println("~~~~~~~~~");
		Vehicle2 c = new Car();
		c.start();
		c.move();
		c.stop();
	}

}
