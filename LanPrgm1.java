package SDET_Training;
import java.util.Scanner;
public class LanPrgm1 {
	public static void main(String[] args) {	//Write a program to print month in words, based on input month in numbers. (using switch case).	
		Scanner in = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int monthNum;
        monthNum = in.nextInt();
        switch (monthNum) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("Invalid month.");
  
	    }
        in.close();
	}

}
