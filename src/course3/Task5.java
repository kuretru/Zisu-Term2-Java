package course3;

public class Task5 {

	private static int factorial(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++)
			result *= i;
		return result;
	}

	public static void main(String[] args) {
		double e = 0, t;
		int i = 0;
		do {
			t = 1.0 / factorial(i++);
			e += t;
		} while (t >= 1e-3);
		System.out.println("e的数值为：" + e);
	}

}
