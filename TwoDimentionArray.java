package SDET_Training;

public class TwoDimentionArray {

	public static void main(String[] args) {
		int[][] a= {{2,4,1},{3,4,5}};
		int[][] b={{1,3,4},{2,4,3}};
		int[][] c = new int[2][2];
		for(int i=0;i<=a.length;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");   
			}
		}
	}
}
