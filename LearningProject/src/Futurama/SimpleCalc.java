package Futurama;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {
		Scanner bender = new Scanner(System.in);
		double fn, sn, result;
		
		System.out.println("������� ������ �����: ");
		fn = bender.nextDouble();
		System.out.println("������� ������ �����: ");
		sn = bender.nextDouble();
		
		result = fn + sn;
		
		System.out.println("����� �����: " + result);
		
	}
}
