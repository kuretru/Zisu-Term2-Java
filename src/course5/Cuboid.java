package course5;

import course4.Rectangle;

public class Cuboid extends Rectangle {
	private float height;

	public Cuboid(float length, float width, float height) {
		super(length, width);
		this.height = height;
	}

	public float perimeter() {
		return 4 * (this.getLength() + this.getWidth() + height);
	}

	public float acreage() {
		float length = this.getLength();
		float width = this.getWidth();
		return 2 * (length * width + length * height + width * height);
	}

	public float volume() {
		return this.getLength() * this.getWidth() * height;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
