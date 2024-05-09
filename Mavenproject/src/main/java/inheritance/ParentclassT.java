package inheritance;

import java.util.Scanner;

public class ParentclassT {
	double basicpay;
	double deduction;
	double bonus;
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic pay");
		basicpay=sc.nextDouble();
		System.out.println("Enter deduction amount");
		deduction=sc.nextDouble();
		System.out.println("Enter the bonus amount");
		bonus=sc.nextDouble();
		
	}

}
