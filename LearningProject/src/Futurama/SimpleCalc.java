package Futurama;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {
		Scanner bender = new Scanner(System.in);
		double fn, sn, result;
		
		System.out.println("¬ведите первое число: ");
		fn = bender.nextDouble();
		System.out.println("¬ведите второе число: ");
		sn = bender.nextDouble();
		
		result = fn + sn;
		
		System.out.println("—умма равна: " + result);
		
	}
}
