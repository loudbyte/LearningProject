package Futurama;

import java.util.EnumSet;
public class Bender {

	public static void main(String[] args) {
		for(Fry heroes : Fry.values()) {
			System.out.printf("%s - %s � %s\n", heroes, heroes.getDesc1(), heroes.getDesc2());
		}
		
		System.out.println("\n� ��� �� �����, ��� �������� ����� ��������� ������������!!!\n");
		
		for(Fry heroes : EnumSet.range(Fry.Fry,Fry.Bender)) {
			System.out.printf("%s - %s � %s\n", heroes, heroes.getDesc1(), heroes.getDesc2());
		}
	}
}
