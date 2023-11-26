package edu.training.lesson7.main;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {

		int size = 7;
		double[] a = new double[size];
		double[] b = new double[a.length];

		initArrayWithRandom(a);
		initArrayWithRandom(b);

		printArray("Массив A: ", a);
		printArray("Массив B: ", b);

		double[] modArr = calculateArray(a, b);
		double[] t = createArr3(modArr);

		printArray("Массив T: ", t);
	}

	public static void initArrayWithRandom(double[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble(50) + 1;
		}
	}

	public static void printArray(String message, double[] mas) {
		System.out.print(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.printf(" [%.2f]  ", mas[i]); // как вывести на консоль, чтобы были ровные столбцы
		}
		System.out.println();
	}

	public static double[] calculateArray(double[] soursArr1, double[] soursArr2) {
		double[] result = new double[soursArr1.length];

		for (int i = 0; i < soursArr1.length; i++) {

			result[i] = soursArr1[i] / soursArr2[i];
		}
		return result;
	}

	public static double[] createArr3(double[] modArr) {
		double[] arr3 = new double[modArr.length];

		for (int i = 0; i < modArr.length; i++) {
			double n = 1 + i;
			arr3[i] = Math.pow(modArr[i], 1.0 / n);
		}
		return arr3;
	}

}
