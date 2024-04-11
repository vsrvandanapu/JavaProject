package exception.handling.userdefinedexception;

class SmallAgeException extends RuntimeException {
	SmallAgeException() {
	}

	SmallAgeException(String str) {
		super(str);
	}
}

class BigAgeException extends RuntimeException {
	BigAgeException() {

	}

	BigAgeException(String str) {
		super(str);
	}
}

public class Sample {

	public static void main(String[] args) {
		System.out.println("Hi Good Morning");
		int age = 26;
		// int age = Integer.parseInt(args[0]);
		try {
			if (age < 20) {
				throw new SmallAgeException("Your age is less than 20");
			} else if (age > 30) {
				throw new BigAgeException("Your age is more than 30");
			} else {
				System.out.println("you are eligible");
			}
		} catch (SmallAgeException sae) {
			sae.printStackTrace();
		} catch (BigAgeException bae) {
			bae.printStackTrace();
		}

		System.out.println("Have a great day");
	}

}
