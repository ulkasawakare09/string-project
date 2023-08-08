package com.stringdemo;

public class MutableStringTest1 {
	public static void main(String args[])
	{
		StringBuffer sb1 = new StringBuffer();
		//StringBuilder sb2 =new StringBuilder();
		
		//StringBuffer sb2="abc";
		//System.out.println(sb1);
		
		System.out.println("Capacity :"+sb1.capacity());//16
		sb1.append("hello");
		System.out.println("sb1       :"+sb1);
		System.out.println("Capacity :"+sb1.capacity());//16		
		sb1.append("welcome hello");
		System.out.println("Capacity :"+sb1.capacity());//34
		
		//new cap=(oldcap+2)+2
		//new cap=(16*2)+2=32+2=34
		System.out.println(sb1);
		//sb1.reverse();
		//sysout(sb1)
		//hellowelcome hello
		
		sb1.delete(2, 5);
		System.out.println(sb1);
		
		sb1.insert(2,"ti");
		System.out.println(sb1);
		System.out.println(sb1.length());
		
		sb1.replace(1, 6, "str1");
		System.out.println(sb1);
		
		String s1=new String(sb1);
		s1=s1.replace('h', 'z');
		System.out.println(s1);
	}

}
