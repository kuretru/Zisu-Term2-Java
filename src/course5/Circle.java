package course5;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getLocation() {
		return String.format("Î»ÖÃÎª(%d,%d)", x, y);
	}

	public int getX() {
		return x;
	}

	public void setX(int value) {
		x = value;
	}

	public int getY() {
		return y;
	}

	public void setY(int value) {
		y = value;
	}
}

public class Circle extends Point {
	int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public String getLocation() {
		return String.format("%s,°ë¾¶Îª%d", super.getLocation(), radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int value) {
		radius = value;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(3, 4, 5);
		System.out.println(circle.getLocation());
	}
}
