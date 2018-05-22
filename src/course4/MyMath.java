package course4;

import java.util.Scanner;

public class MyMath {
	private float x;
	private float y;

	public float getX() {
		return x;
	}

	public void setX(float value) {
		this.x = value;
	}

	public float getY() {
		return y;
	}

	public void setY(float value) {
		this.y = value;
	}

	public float add() {
		return x + y;
	}

	public static boolean isPrime(int n) {
		int end = (int) Math.sqrt(n);
		for (int i = 2; i <= end; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MyMath myMath = new MyMath();
		System.out.println("请输入两个浮点数：");
		myMath.setX(scanner.nextFloat());
		myMath.setY(scanner.nextFloat());
		int start = (int) myMath.getX();
		int end = (int) myMath.getY();
		if (start > end) {
			int tmp = start;
			start = end;
			end = tmp;
		}
		System.out.printf("%d到%d之间的质数为：", ++start, --end);
		for (int i = start; i <= end; i++) {
			if (MyMath.isPrime(i)) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n两数和为：" + myMath.add());
		scanner.close();
	}
}
