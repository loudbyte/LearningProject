package Futurama;

public class Fry {
	private String fname;
	private String lname;
	private static int count = 0;
	
	public Fry(String fn, String ln) {
		fname = fn;
		lname = ln;
		count++;
		System.out.printf("%s %s: � ������ 12 ������� -%d ��������(�\\��. \n", fname, lname, count);
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public static int getCount() {
		return count;
	}
}
