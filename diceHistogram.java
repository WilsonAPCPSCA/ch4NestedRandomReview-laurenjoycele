import java.util.Scanner;
import java.util.Random;
public class diceHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rando = new Random();
		int histogram[] = new int[13];
		
		
		System.out.println("This program will simulate tossing a pair of dice. \nHow many times would you like the dice to be tossed?");
		int timesTossed = in.nextInt();
		
		System.out.println("Here is the sequence of sums, one for each toss: ");
		
		
		for (int i=1; i<=timesTossed; i++)
		{
			int firstDice = rando.nextInt(6) + 1;
			int secDice = rando.nextInt(6) + 1;
			int sumOfToss = firstDice + secDice;
			histogram[ sumOfToss ]++;
			System.out.print(sumOfToss+ " ");
		}
		
		for (int i=2; i<=12; i++)
		{
			System.out.printf("\n%d: ", i);
 
			for (int j =0; j < histogram[i]; j++)
			{
    			System.out.print("*");
			}
		}
		
	}

}
