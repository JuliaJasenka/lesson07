package edu.training.lesson7.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {

		int n = 5;
		double[] c = new double[n];
		double[] b = new double[n];

		initArrayWithRandom(c);
		initArrayWithRandom(b);

		printArray("Массив С: ", c);
		printArray("Массив B: ", b);

		result(c, b);
	}

	public static void initArrayWithRandom(double[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() * 100;
		}
	}

	public static void printArray(String message, double[] mas) {
		System.out.println(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%.2f]", mas[i]);
		}
		System.out.println();
	}

	public static void result(double[] c, double[] b) {
		double tmp = 0;

		for (int i = 0; i < c.length; i++) {
			tmp = tmp + Math.pow((c[i] - b[i]), 2);
		}
		double r = Math.sqrt(tmp);
		System.out.println("R = " + r);
	}
}
