package course3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ĳɼ���");
		int number = scanner.nextInt();
		int grade = 1;
		if (number >= 90 && number <= 100)
			grade = 5;
		else if (number >= 75)
			grade = 4;
		else if (number >= 60)
			grade = 3;
		else if (number >= 40)
			grade = 2;
		System.out.println("��������Ϊ��" + grade);
		scanner.close();
	}
}
