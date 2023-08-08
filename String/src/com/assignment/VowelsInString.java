package com.assignment;

public class VowelsInString {
	public static void PrintAllVowelsFromString(String s)
	{
		int i, len = s.length();
		char ch;
		{
		for(i=0;i<len;i++)
		{
			ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " is vowel");
			}
			else
				System.out.println(ch + " is consonant");
		}
	}
}
public static void printAllVowels(String s) {
		int i, len = s.length();
		char ch;

		for (i = 0; i < len; i++) {
			ch = s.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
			}
		}
	}

	public static void main(String args[]) {
		String s1 = "welcome";
		PrintAllVowelsFromString(s1);
		System.out.println("----------------");
		printAllVowels(s1);
	}
}