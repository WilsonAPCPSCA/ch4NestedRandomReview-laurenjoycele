//#3
import java.util.Scanner;
public class diamondSideLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an integer");
		int sideLength=in.nextInt();

		for (int i=1; i<=sideLength; i++)
		{	
			for (int m=sideLength-i; m>0; m--)
			{	
				System.out.print(" ");
				
			}
			for (int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		for (int j=sideLength; j>=1; j--)
		{
			for (int k=j; k<=sideLength; k++)
			{
				System.out.print(" ");
			}
			for (int n=2*j-3; n>=1; n--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
