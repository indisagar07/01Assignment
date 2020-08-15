package com.assignment1;

public class SamllestPair10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 1, 2, 9, 6 };

		int len = arr.length;

		int x, y;
		x = arr[0];
		y = arr[1];

		if (x >= arr[1]) {
			y = x;
			x = arr[1];
		} else
			y = arr[1];
		for (int i = 2; i < len; i++) {
			if (x > arr[i]) {
				y = x;
				x = arr[i];
			} else if (y > arr[i])
				y = arr[i];
		}

		System.out.println(x + y);

	}

}
