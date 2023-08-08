//compareTo method is overriden by comparable interface
//use to check value is equal or not
//it takes string value as input and give output in int
package com.assignment;

public class EqualityTestOfStringDemo2 {
	public static void main(String args[])
	{
		//s1==s2   0
		//s1>s2    Positive
		//s1<s2	   Negative
		
		String s1 = "a"; //97
		
		String s2 = "c"; //99
		
		//String s1 = "welcome"; //w=119
		
		//String s2 = "hello"; //h=104    119-104=15
		
		int a=s1.compareTo(s2);// 0  no 0 pos neg
		
		System.out.println("a =" +a);
		
		if(a==0)
		{
			System.out.println("Both Strings are equal");
		}
		else
		{
			System.out.println("Both Strings ar not equal");
		}
	}

}
