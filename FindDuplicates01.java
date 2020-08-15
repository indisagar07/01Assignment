package com.assignment1;

import java.util.Arrays;

public class FindDuplicates01 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 5, 6, 6, 7, 2 };
		int len = arr.length;

		Arrays.sort(arr);

		for (int i = 0; i < len - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
