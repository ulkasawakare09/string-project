/*2. Compare string using == when “” is present see same reference is there
*/
package com.stringassignment;

public class EqualToOperator {
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="Hello";
		String s3="Hello";
		String s4="Hi";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
	}

}
