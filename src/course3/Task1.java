package course3;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("������һ��Сд��ĸ��");
		char c = ' ';
		try {
			c = (char) System.in.read();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		if (c >= 'a' && c <= 'z')
			System.out.printf("%c", c - 32);
		else
			System.out.println("������Ĳ���Сд��ĸ���޷����ָ������");
	}
}
