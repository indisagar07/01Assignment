package com.assignment1;

public class Intersection3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 1, 5, 10, 20, 40, 80, 100, 120 };
		int arr2[] = { 6, 7, 20, 80, 100 };
		int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 100, 120 };

		printIntersection(arr1, arr2, arr3);
	}

	private static void printIntersection(int[] arr1, int[] arr2, int[] arr3) {

		int len1 = arr1.length;
		int len2 = arr2.length;
		int len3 = arr3.length;
		int i = 0, j = 0, k = 0;

		while (i < len1 && j < len2 && k < len3) {

			if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
				System.out.print(arr1[i] + "  ");
				i++;
				j++;
				k++;
			} else {/*
					 * if (arr1[i] >= arr2[j] && arr2[j] >= arr3[k]) { k++; } else if (arr2[j] >=
					 * arr3[k] && arr3[k] >= arr1[i]) { i++; } else if (arr3[k] >= arr1[i] &&
					 * arr1[i] >= arr2[j]) { j++; }
					 */

				int t = findMin(arr1[i], arr2[j]);

				t = findMin(t, arr3[k]);

				if (t == arr1[i]) {
					i++;
				} else if (t == arr2[j]) {
					j++;
				} else if (t == arr3[k]) {
					k++;
				}
			}
		}
	}

	private static int findMin(int i, int j) {
		// TODO Auto-generated method stub

		return (i < j) ? i : j;
		// return 0;
	}

}
