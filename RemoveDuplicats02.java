package com.assignment1;

import java.util.Arrays;

public class RemovieDuplicats02 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int len = arr.length;

		Arrays.sort(arr);

		int count = 0;

		for (int i = 0; i < len - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			}
		}

		int des[] = new int[len - count];
		int j = 0;

		for (int i = 0; i < len - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				des[j] = arr[i];
				j++;
			}

		}

		if (arr[len - 1] != arr[len - 2])
			des[j] = arr[len - 1];

		for (int i = 0; i <= j; i++) {
			System.out.print(des[i] + " ");
		}

	}

}
