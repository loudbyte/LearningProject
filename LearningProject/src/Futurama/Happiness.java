package Futurama;

import java.util.Random;
import java.util.Scanner;

public class Happiness {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner enter = new Scanner(System.in);
		
		int happiness, luck, wealth, health, intelligense, age;
		happiness = 0;
		luck = 0;
		wealth = 0;
		health = 0;
		intelligense = 0;
		
		System.out.println("����� ���� �������: ");
		age = enter.nextInt();
		
		while(age < 100) {
			happiness += random.nextInt(100);
			luck += random.nextInt(100);
			wealth += random.nextInt(100);
			health += random.nextInt(100);
			intelligense += random.nextInt(100);
			age++;
		}
		System.out.println("� ���� " + age + " ���, �� �������� ����������� �����!");
		System.out.println("������� ������� ����� " + happiness + "!!!");
		System.out.println("������� ����� ����� " + luck + "!!!");
		System.out.println("������� �������������� ����� " + wealth + "!!!");
		System.out.println("������� �������� ����� " + health + "!!!");
		System.out.println("������� ���������� ����� " + intelligense + "!!!");
		
	}

}
