package course3;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("请输入一个小写字母：");
		char c = ' ';
		try {
			c = (char) System.in.read();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		if (c >= 'a' && c <= 'z')
			System.out.printf("%c", c - 32);
		else
			System.out.println("您输入的不是小写字母，无法完成指定操作");
	}
}
