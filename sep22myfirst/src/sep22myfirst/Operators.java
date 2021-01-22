package sep22myfirst;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int x=10;
		int y=10;
		float z=12.5f;
		String language="java programming";
			System.out.println("integer x value:"+ x + " integer y value:"+ y + " float z value: "+ z);
			System.out.println("string language value "+language);
			
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=s1.nextInt();
		System.out.println("Enter the 2nd number");
		int b=s1.nextInt();
		
		//int a=30;
		//int b=10;
		
		int sum=a+b;
		int subtract=a-b;
		int multiple=a*b;
		int divide=a/b;
		int modulus=a%b;
		System.out.println("The result of adding is "+sum);
		System.out.println("The result of subtracting is "+subtract);
		System.out.println("The result of multipling is "+multiple);
		System.out.println("The result of dividing is "+divide);
		System.out.println("The result of modulus is " + modulus);
		

	}

}
