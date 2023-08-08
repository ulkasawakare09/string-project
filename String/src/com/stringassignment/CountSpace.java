package com.stringassignment;

public class CountSpace {
	public static void main(String args[]) {
		String s1 = " rose is red ";
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				count++;

			}
		}
		System.out.println("number of space :" + count);
	}

}
