package com.assignment1;

import java.util.PriorityQueue;

public class ThirdHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 6, 8, 1, 9, 2, 1, 10 };
		int len = arr.length;

		if (len < 3) {
			System.out.println("invalid Input");
			return;

		}

		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		for (int i = 0; i < 3; i++) {
			q.add(arr[i]);
		}

		for (int i = 3; i < len; i++) {
			if (arr[i] > q.peek()) {
				q.remove();
				q.add(arr[i]);
			}
		}

		System.out.println(q.peek());
	}

}
