package com.stringdemo;
//print ASCII value for every char

public class PrintAsciiValue {
	public static void main(String args[]) {
		String s1="india";
		int i,len=s1.length();
		char ch;
		
		for(i=0;i<len;i++)
		{
			ch=s1.charAt(i);
			System.out.println(ch+" = "+(int)ch);
		}
	}

}

