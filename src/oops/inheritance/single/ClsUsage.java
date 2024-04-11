package oops.inheritance.single;

public class ClsUsage {

	public static void main(String[] args) {
		ClsParent pObj = new ClsParent();
		System.out.println("The A value is : " + pObj.a);
		//System.out.println("The B value is : " + pObj.b);
		pObj.m1();
		
		System.out.println("========================");
		ClsChild cObj = new ClsChild();
		System.out.println("The A value is : " + cObj.a);
		System.out.println("The B value is : " + cObj.a);
		cObj.m1();
		cObj.m2();
		

	}

}
