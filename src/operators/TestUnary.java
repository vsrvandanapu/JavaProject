package operators;

public class TestUnary {

	public static void main(String[] args) {
		// unary minus(-)
		int a;
		a = 10;
		System.out.println(a);//10
		System.out.println(-a);//-10
		int b = -20;
		System.out.println(b);//-20
		System.out.println(-b);//-(-20) = 20
		//Increment Operator (++):
		int num = 100;
		num++; // num = num + 1;
		System.out.println(num);
		
		//Decrement Operator (--)
		int x = 50;
		x--; // x = x - 1;
		System.out.println(x);
	}

}
