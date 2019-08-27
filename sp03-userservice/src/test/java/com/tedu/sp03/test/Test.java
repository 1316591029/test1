package com.tedu.sp03.test;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int[] arr = suiji();
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] suiji() {
		int a = new Random().nextInt(10) + 5;
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		return arr;
	}

//	private static void sort(int[] a) {
//		for (int i = 0; i < a.length; i++) {
//			for (int j = a.length - 1; j > i; j--) {
//				if (a[j] < a[j - 1]) {
//					int t = a[j];
//					a[j] = a[j - 1];
//					a[j - 1] = t;
//				}
//			}
//		}
//
//	}
	private static void sort(int[] a) {

		for (int i = 0; i < a.length; i++) {

			for (int j = a.length - 1; j > i; j--) {

				if (a[j] < a[j - 1]) {

					int t = a[j];

					a[j] = a[j - 1];

					a[j - 1] = t;

				}

			}

		}

	}

}
