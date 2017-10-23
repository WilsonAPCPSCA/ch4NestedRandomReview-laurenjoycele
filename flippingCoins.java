import java.util.Scanner;

public class flippingCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("This program will simulate flipping a fair coin.\nHow many times would you like the coin to be flipped?");
		int times=in.nextInt();
		String side="T";
		int headCount=0;
		int tailCount=0;
		
		System.out.println("Here is the sequence of flips:");
		
		for (int i=1; i<=times; i++)
		{
			double rando=Math.random();
			if ( rando >= 0.5 )
			{
				side="T";
				tailCount++;
			}
			else 
			{
				side="H";
				headCount++;
			}
			System.out.print(side);
			
		}
		
		System.out.printf("\nThere were %d heads and %d tails.\n", headCount, tailCount);
		
		
	}

}
