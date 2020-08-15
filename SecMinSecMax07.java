package com.assignment1;

public class SecMinSecMax07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 5, 9, 6, 4, 7, 2 };
		int len = arr.length;

		int x, y;
		int a, b;

		x = arr[0];
		y = arr[1];

		if (x > y) {
			int t = x;
			x = y;
			y = t;

		}

		a = y;
		b = x;

		for (int i = 2; i < len; i++) {
			if (arr[i] < x) {
				y = x;
				x = arr[i];
			} else if (arr[i] < y) {
				y = arr[i];
			}

			if (arr[i] > a) {
				b = a;
				a = arr[i];
			} else if (arr[i] > b) {
				b = arr[i];
			}
		}

		System.out.println("Secon Min : " + y + "  Second Max: " + b);
	}

}
