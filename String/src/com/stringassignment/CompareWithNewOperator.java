/*3. Compare string using new operator when new is present see different reference is there
*/
package com.stringassignment;

public class CompareWithNewOperator {
	public static void main(String args[])
	{
		String s1 = new String("Hello");
		String s2 = new String("Welcome");
		String s3 = new String("Hello");
		
		System.out.println((s1==s2)+" "+ "String are not equal");
		System.out.println((s2==s3)+" "+"String are not equa");
		System.out.println((s3==s1)+" "+"String are equal");
	}

}
