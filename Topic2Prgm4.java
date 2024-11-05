package SDET_Training;
import java.util.Scanner;
public class Topic2Prgm4 {

	public static void main(String[] args) {
		// Write a program to check whether the given string is a palindrome or not.
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		int l=s.length();
		String rev = "";
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.print("Reversed String is: "+rev + "\n");
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
		sc.close();
	}
}
