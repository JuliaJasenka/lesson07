package edu.training.lesson7.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int size = 5;
		double[] x = new double[size];
		double[] z = new double[size];

		initArrayWithRandom(x);
		initArrayWithRandom(z);

		printArray("Массив Х: ", x);
		printArray("Массив Z: ", z);

		double[] modifiedX = calculateArray(a, b, x);
		double[] modifiedY = calculateArray(c, d, z);
		double[] y = createArr3(modifiedX, modifiedY);

		printArray("Массив Y: ", y);
	}

	public static void initArrayWithRandom(double[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble(100);
		}
	}

	public static void printArray(String message, double[] mas) {
		System.out.print(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%.2f] ", mas[i]);
		}
		System.out.println();
	}

	public static double[] calculateArray(int value1, int value2, double[] soursArray) {
		double[] result = new double[soursArray.length];

		for (int i = 0; i < soursArray.length; i++) {
			result[i] = value1 * soursArray[i] + value2;
		}
		return result;
	}

	public static double[] createArr3(double[] arr1, double[] arr2) {
		double[] arr3 = new double[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] / arr2[i];
		}
		return arr3;
	}
}
