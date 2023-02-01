package scanner;

import java.util.Scanner;

public class userDefined {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String n=s.next();
		System.out.println("enter the name:"+n);
		System.out.println("Enter the company name");
		s.nextLine();
		String c=s.nextLine();
		System.out.println("age");
		//byte age=28;
		byte age=s.nextByte();
		System.out.println("Age is:"+age);
		System.out.println("Enter the mobile");
		long mob=s.nextLong();
		System.out.println("mobile number is"+mob);
		System.out.println("enter the salary");
		float f=s.nextFloat();
		System.out.println("salary is "+f);	
	}

}
