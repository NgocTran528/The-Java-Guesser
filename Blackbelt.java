import java.util.Scanner;

public class Blackbelt {
	protected Scanner input;

	public static void main(String[] args){
		Blackbelt b = new Blackbelt();
	} // end main
	
	public Blackbelt(){
		input = new Scanner(System.in);
		String choice = "";
		boolean keepGoing = true;
		while (keepGoing){
			choice = menu();
			if (choice.equals("1")){
				humanGuesser();
			} else if (choice.equals("2")){
				computerGuesser();
			} else if (choice.equals("3")) {
				race();
			} else if (choice.equals("0")){
				keepGoing = false;
			} else {
				System.out.println("not a valid choice");
			} // end if
		} // end while
	} // end constructor
	
	public String menu(){
		System.out.println();
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");
		System.out.println("3) Race");
		System.out.println();
		System.out.print("Please enter 0-3: ");
		String choice = input.nextLine();
		return choice;
	} // end menu
	
	public int humanGuesser(){
		System.out.println("human guesser");
		int answer = (int)(Math.random() * 100) + 1;
		int tries = 0;
		int guess = 0;
		while (guess != answer){
			tries++;
			System.out.print(tries + ") Please enter a number: ");
			guess = Integer.parseInt(input.nextLine());
			if (guess < answer) {
				System.out.println("too low");
			} else if (guess > answer){
				System.out.println("too high");
			} else {
				System.out.println("got it!");
			} // end if
		} // end while
		System.out.println();
		System.out.println("Very good!");
		return tries;
	} // end humanGuesser
	
	public int computerGuesser(){
		System.out.println("computer guesser");
		int low = 1;
		int high = 100;
		int tries = 0;
		int guess = 0;
		String response = "";
		while (!response.equals("c")){
			tries++;
			guess = (low + high) / 2;
			System.out.println(tries + ") I guess " + guess);
			System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
			response = input.nextLine().toLowerCase();
			if (response.equals("h")){
				high = guess - 1;
			} else if (response.equals("l")){
				low = guess + 1;
			} // end if
		} // end while
		return tries;
	} // end computerGuesser
	
	public void race(){
		System.out.println("You guess first, then the computer. Fewest tries wins!");
		int humanTries = humanGuesser();
		int computerTries = computerGuesser();
		System.out.println();
		System.out.println("Human: " + humanTries + " tries");
		System.out.println("Computer: " + computerTries + " tries");
		if (humanTries < computerTries){
			System.out.println("Human wins!");
		} else if (computerTries < humanTries) {
			System.out.println("Computer wins!");
		} else {
			System.out.println("It's a tie");
		} // end if
	} // end race
} // end class Guesser
