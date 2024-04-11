package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		boolean a = true, b = true;
		// And - &&
		System.out.println( a && b); // true
		System.out.println( a && (!b)); // false
		System.out.println((!a) && b); // false
		System.out.println((!a) && (!b));//false
		System.out.println("__________________");
		//Not operator : (!)
		System.out.println(!( a && b)); // false
		System.out.println(!( a && (!b))); // true
		System.out.println(!((!a) && b)); // true
		System.out.println(!((!a) && (!b)));//true
		// OR operator (||)
		/*
		System.out.println(a || b); // true
		System.out.println(a || (!b)); //true
		System.out.println((!a) || b); //true
		System.out.println((!a) || (!b)); //false
		*/
		
		
		/*
		System.out.println(a);// true
		System.out.println(!a);// false
		*/
	}

}
