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
		
		System.out.println("Введи свой возраст: ");
		age = enter.nextInt();
		
		while(age < 100) {
			happiness += random.nextInt(100);
			luck += random.nextInt(100);
			wealth += random.nextInt(100);
			health += random.nextInt(100);
			intelligense += random.nextInt(100);
			age++;
		}
		System.out.println("В ваши " + age + " лет, вы довольно продвинутый перец!");
		System.out.println("Уровень счастья равен " + happiness + "!!!");
		System.out.println("Уровень удачи равен " + luck + "!!!");
		System.out.println("Уровень благосостояния равен " + wealth + "!!!");
		System.out.println("Уровень здоровья равен " + health + "!!!");
		System.out.println("Уровень интеллекта равен " + intelligense + "!!!");
		
	}

}
