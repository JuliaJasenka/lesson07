package edu.training.lesson7.main;

public class Task04 {

	public static void main(String[] args) {

		int n = 11;
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;

		numericalSeriesFibonacci(arr);

		printArray("Первые " + n + " элементов числового ряда Фибоначчи: ", arr);

	}

	public static void numericalSeriesFibonacci(int[] arr) {
		for (int i = 2; i < arr.length; ++i) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
	}

	public static void printArray(String message, int[] mas) {
		System.out.print(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}
}
