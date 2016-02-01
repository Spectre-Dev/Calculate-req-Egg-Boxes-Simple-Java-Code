import java.util.Scanner;
public class EggApp {
	private static int egg_amount;
	
	public static void main(String[] args) {
		
		//Create User input
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		//Ask for user input
		System.out.println("Enter in the number of eggs please?");
		egg_amount = keyboard.nextInt();
		//Enter the amount of eggs entered by the user.
		EggBox boxingeggs = new EggBox(egg_amount);
		//Calculate the amount of boxes needed and the remaining eggs that did not add up to a dozen.
		boxingeggs.calculateBoxAndEggs();
		
		//Print out the results
		System.out.println("The amount of boxes needed is " + boxingeggs.getBoxAmount() + " and the remaining eggs is " + boxingeggs.getEggAmount());
		
	}
}