package com.tedu.sp03.test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder str1 = sb.append(str).reverse();
		System.out.println(str.equals(str1));

	}

}
