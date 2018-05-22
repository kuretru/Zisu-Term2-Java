package course4;

public class Time {
	private int hour;
	private int minute;

	public Time() {
		long now = System.currentTimeMillis() / 1000 / 60;
		this.minute = (int) (now % 60);
		this.hour = (int) (now / 60 % 24 + 8);// Ê±Çø×ª»»
	}

	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public void addOneHour() {
		this.hour++;
		if (hour >= 24)
			this.hour -= 24;
	}

	public void addHour(int hour) {
		this.hour += hour;
		this.hour %= 24;
	}

	public void addOneMinute() {
		this.minute++;
		if (minute >= 60) {
			addOneHour();
			this.minute -= 60;
		}
	}

	public void addMinute(int minute) {
		this.minute += minute;
		while (this.minute >= 60) {
			addOneHour();
			this.minute -= 60;
		}
	}

	public String toString(int type) {
		if (type == 0)
			return String.format("%02d:%02d", hour, minute);
		if (hour <= 12)
			return String.format("%02d:%02dAM", hour, minute);
		else
			return String.format("%02d:%02dPM", hour - 12, minute);
	}

	public static void main(String[] args) {
		Time time = new Time();
		System.out.println(time.toString(0));
		time.addOneHour();
		System.out.println(time.toString(0));
		time.addHour(3);
		System.out.println(time.toString(0));
		time.addOneMinute();
		System.out.println(time.toString(0));
		time.addMinute(5);
		System.out.println(time.toString(1));
	}
}
