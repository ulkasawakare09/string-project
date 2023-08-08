package com.stringdemo;

public class StringMethodsDemo {
	public static void main(String args[])
	{
		String s1 = "hello , hi";
		
		String s2= "WELCOME";
		s1.toUpperCase();
		System.out.println(s1);//hello
		
		//case1
		System.out.println((s1.toUpperCase()));//HELLO
		
		//case2
		s1=s1.toUpperCase();
		System.out.println(s1);//HELLO
		String s3 = s2.toLowerCase();
		System.out.println(s3);//welcome
		
		//lenght()-how many chars re present
		int len=s1.length();
		System.out.println("Length of s1:"+len);
		System.out.println("Length of s2:"+s2.length());
		
		//charAt(int index)
		//char ch1=s1.charAt(1);
		//char ch1=s1.charAt(10);
		//char ch1=s1.charAt('a');
		//char ch1=s1.charAt(s1.length());
		char ch1=s1.charAt(s1.length()-1);
		//char ch1=s1.charAt(len-1);

		System.out.println("Char present at index 1 is"+ch1);
		



		

	}

}
