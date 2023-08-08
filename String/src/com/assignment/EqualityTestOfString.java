package com.assignment;

public class EqualityTestOfString {
	public static void main(String args[])
	{
		String s1 = "swati";
		
		String s2 = "swati";
		
		String s3=s1;
		
		String s4="rahul";
		
		System.out.println("s1==s2: "+(s1==s2));
		
		System.out.println("s1==s3: "+(s1==s3));

		System.out.println("s1==s2: "+(s1==s4));
		
		boolean ans = s1.equals(s2);
		
		System.out.println(ans);
		
		System.out.println(s2.equals(s3));


	}

}
