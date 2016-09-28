public class constructorsObject {
	private int hour;
	private int minute;
	private int second;

	public constructorsObject() {
		this(0,0,0);
	}
	public constructorsObject(int h) {
		this(h,0,0);
	}
	public constructorsObject(int h, int m) {
		this(h,m,0);
	}
	public constructorsObject(int h, int m, int s) {
		setTime(h, m, s);
	}
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	// set methods:
	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ?h:0);
	}
	public void setMinute(int m) {
		hour = ((m >= 0 && m < 60) ?m:0);
	}
	public void setSecond(int s) {
		hour = ((s >= 0 && s < 60) ?s:0);
	}
	// get methods:
	public int getHour() {
		return hour;
	}
	public int getSecond() {
		return second;
	}
	public int getMinute() {
		return minute;
	}
	PUblic String toMilitary() {
		return String.formate("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}