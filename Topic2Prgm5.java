package SDET_Training;

public class Topic2Prgm5 {
	public enum Weekday { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	public static void main(String[] args) {
	   //Write a java program to create enum type all the days of the week and a method that prints a String corresponding to the day value that passed in as argument.
		Weekday[] days=Weekday.values();
		for (Weekday day : days) {
			switch (day)
			{
			case SUNDAY:
		        System.out.println("Sunday - 1");
		        break;
		    case MONDAY:
		        System.out.println("Monday - 2");
		        break;
		    case TUESDAY:
		        System.out.println("Tuesday - 3");
		        break;
		    case WEDNESDAY:
		        System.out.println("Wednesday - 4");
		        break;
		    case THURSDAY:
		        System.out.println("Thursday - 5");
		        break;
		    case FRIDAY:
		        System.out.println("Friday - 6");
		        break;
		    case SATURDAY:
		        System.out.println("Saturday - 7");
		        break;	       
			}			
		}
	}
}
