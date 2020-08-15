package com.assignment1;

import java.util.Arrays;

public class SumOfUnic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int arr[] = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };
		int arr[] = { 1, 1, 3, 2, 2, 3 };

		int len = arr.length;

		Arrays.sort(arr);
		int sum = 0;

		for (int i = 0; i < len - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				sum += arr[i];
			}
		}

		if (arr[len - 1] != arr[len - 2])
			sum += arr[len - 1];

		System.out.println(sum);
	}

}
