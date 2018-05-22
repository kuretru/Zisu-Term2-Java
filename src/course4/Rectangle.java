package course4;

import java.util.Scanner;

public class Rectangle {
	private float length;
	private float width;

	public Rectangle(float length, float width) {
		if (length < 0)
			length = 0;
		if (width < 0)
			width = 0;
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width) {
		if (length < 0)
			length = 0;
		if (width < 0)
			width = 0;
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float perimeter() {
		return 2 * (this.length + this.width);
	}

	public float acreage() {
		return length * width;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一块土地的长和宽，(输入0 0停止)：");
			float x = scanner.nextFloat();
			float y = scanner.nextFloat();
			if (x <= 0 || y <= 0)
				break;
			Rectangle rectangle = new Rectangle(x, y);
			System.out.printf("该土地的周长为：%f，面积为：%f\n", rectangle.perimeter(), rectangle.acreage());
		}
		scanner.close();
	}
}
