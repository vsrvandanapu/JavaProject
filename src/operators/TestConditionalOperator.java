package operators;

class TestConditionalOperator {

	public static void main(String[] args) {
		// Syntax:		 (condition) ? exp1 : exp2
		int a = 100, b = 15;
//		System.out.println((a > b) ? a : b);
		System.out.println((a > b) ? "Big Number is :" + a : "Big Number is :" +b);
		System.out.println((a < b) ? "Small Number is :" + a : "Small Number is :" +b);

	}

}
