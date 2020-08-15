package com.assignment1;

import java.util.HashSet;

public class FindElementPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 6, 8, -8, 10, 8 };

		int sum = 16;

		HashSet<Integer> hm = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			int diff = sum - arr[i];

			if (hm.contains(diff) == true) {
				System.out.println("pairs : ( " + arr[i] + "," + diff + " )");
			} else
				hm.add(arr[i]);

		}

	}

}
