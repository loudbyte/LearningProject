package Futurama;

import java.util.EnumSet;
public class Bender {

	public static void main(String[] args) {
		Fry pers1 = new Fry("�����", "������");
		Fry pers2 = new Fry("����", "������������");
		Fry pers3 = new Fry("����", "�����");
		
		System.out.println();
		
		System.out.println(pers3.getFname());
		System.out.println(pers3.getLname());
		System.out.println(Fry.getCount());
	}
}
