/*	22. Write a Java program to count total number of vowels and consonants in a string.
*/
package com.stringaddones;

public class VovelsAndConsonant {
	public static void main(String args[]) {
		String s = "India is my country";
		int len = s.length();

		char ch1;

		for (int i = 0; i < len; i++) {
			ch1 = s.charAt(i);
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')

				System.out.println(ch1 + " is vowel");

			else {
				System.out.println(ch1 + " is consonant");
			}
		}
	}
}
