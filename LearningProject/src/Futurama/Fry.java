package Futurama;

public enum Fry {
	Amy("китаянка", "секси"),
	Fry("тупой", "ленивый"),
	Rick("алкоголик", "гений"),
	Homer("жирный", "прикольный"),
	Bender("железный", "злой"),
	Stewe("злой","гений");
	
	private final String desc1;
	private final String desc2;
	
	Fry(String d1, String d2) {
		desc1 = d1;
		desc2 = d2;
	}
	public String getDesc1() {
		return desc1;
	}
	public String getDesc2() {
		return desc2;
	}
}
