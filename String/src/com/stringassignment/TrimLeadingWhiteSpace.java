/*12. Write a Java program to trim leading white space characters in a string.
 trim():removes white space*/
package com.stringassignment;

public class TrimLeadingWhiteSpace {
	public static void main(String args[]) {
		String s1 = " Think Q ";
		System.out.println(s1.length());

		String s2 = s1.trim();
		System.out.println(s2);
		System.out.println(s2.length());
	}
}
