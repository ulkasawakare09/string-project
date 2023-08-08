package com.assignment;

public class EqualIgnoreCase {
	public static void main(String args[]) {
		String s1 = "welcome";

		String s2 = "wello";

		String s3 = "WELCOME";

		int a = s1.compareToIgnoreCase(s3);

		System.out.println("a=" + a);
		if (a == 0) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Both Strings ar not equal");
		}
	}

}
