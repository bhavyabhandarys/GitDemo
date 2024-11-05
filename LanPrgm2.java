package SDET_Training;

import java.util.Scanner;

public class LanPrgm2 {

	public static void main(String[] args) {
		//Write a program that will accept a 4-digit number (assume that the user enters only 4 digit nos.) 
		//and print the sum of all the 4 digits. For ex: If the number passed is 3629, the program should 
		//print "The sum of all the digits entered is 20"
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 4 digit number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<4;i++)
		{
			sum = sum+n%10;
			n=n/10;
		}
		System.out.println("Sum: " +sum);
		sc.close();
	}
	

}
