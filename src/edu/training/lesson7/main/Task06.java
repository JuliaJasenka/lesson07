package edu.training.lesson7.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {

		int n = 9;
		int[] x = new int[n];
		int[] y = new int[n];

		initArrayWithRandom(x);
		initArrayWithRandom(y);

		printArray("Массив Х: ", x);
		printArray("Массив Y: ", y);

		arrayInfo(x, y);
	}

	public static void initArrayWithRandom(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(31) - 10;
		}
	}

	/*
	 * public static void numberOfElements(int[] arr1, int[] arr2) { int count = 0;
	 * for (int i = 0; i < arr1.length; i++) { if (checkElemets(arr1[i], arr2[i])) {
	 * count++; } } printNumber("Число элементов, удовлетворяющих условиям: ",
	 * count); }
	 * 
	 * public static void sumOfElements(int[] arr1, int[] arr2) { int sum = 0; for
	 * (int i = 0; i < arr1.length; i++) { if (checkElemets(arr1[i], arr2[i])) { sum
	 * += arr1[i]; } } printNumber("Сумма элементов, удовлетворяющих условиям: ",
	 * sum); }
	 */

	public static void arrayInfo(int[] arr1, int[] arr2) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (checkElemets(arr1[i], arr2[i])) {
				sum += arr1[i];
				count++;
			}
		}
		printNumber("Число элементов, удовлетворяющих условиям: ", count);
		printNumber("Сумма элементов, удовлетворяющих условиям: ", sum);
	}

	public static boolean checkElemets(int value1, int value2) {
		return value1 > value2 && value1 > 0;
	}

	public static void printArray(String message, int[] mas) {
		System.out.print(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	public static void printNumber(String message, int value3) {
		System.out.print(message + value3);
		System.out.println();
	}
}
