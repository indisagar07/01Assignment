package com.assignment1;

public class PrintMInMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = { 9, 2, 12, 5, 4, 7, 3, 19, 5 };
		int arr[] = { 1, 2, 5, 5, 6, 6, 7, 2 };

		int len = arr.length;

		int max, min;

		max = arr[0];
		min = arr[0];
		// diff = max - min;

		for (int i = 1; i < len; i++) {
			if (max < arr[i])
				max = arr[i];
			else if (min > arr[i])
				min = arr[i];

			// diff = max - min;
		}

		System.out.println("Min : " + min + "  Max : " + max);

	}

}
