package SDET_Training;

public class LanPrgm3 {

	public static void main(String[] args) {
		//Write a program to find greatest number in an array
		
		int a[] = {10, 20,4545,6354,23};
		
		int max= a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}	
		}
		System.out.println("Max number: " +max);
	}
}
