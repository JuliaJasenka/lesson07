package edu.training.lesson7.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {

		int n = 7;
		int[] x = new int[n];
		
		initArrayWithRandom(x);

		printArray("Исходный массив: ", x);

		int[] y = createNewArray(x);

		printArray("Новый массив :   ", y);
	}

	public static void initArrayWithRandom(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(31) - 10;
		}
	}

	public static void printArray(String message, int[] mas) {
		System.out.print(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%3d]", mas[i]);
		}
		System.out.println();
	}

	private static int[] createNewArray(int[] array) {
		int[] newArray = new int[array.length];
		int positiveIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				newArray[positiveIndex++] = array[i];
		}
		int negativeIndex = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] < 0)
				newArray[negativeIndex--] = array[i];
		}
		return newArray;
	}
}
