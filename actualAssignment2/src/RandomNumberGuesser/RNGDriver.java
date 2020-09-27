package RandomNumberGuesser;

import java.util.Scanner;


public class RNGDriver  {

	public static void main(String[] args) {
				
Scanner input= new Scanner(System.in);
String answer;
int randNum, highGuess, lowGuess, nextGuess;
boolean valid;



	
	randNum = RNG.rand();
	highGuess = 100;
	lowGuess = 0;
	System.out.println("Enter your first guess");
	nextGuess = input.nextInt();
	valid = RNG.inputValidation(nextGuess, lowGuess, highGuess);
	if (!valid) {
		nextGuess = input.nextInt();
	}
	System.out.println("Number of guesses is " + RNG.getCount());
	if (nextGuess > randNum) {
		System.out.println("Your guess is too high");
		highGuess = nextGuess;
		System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
	} else if (nextGuess < randNum) {
		System.out.println("Your guess is too low");
		lowGuess = nextGuess;
		System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
	} else {
		System.out.println("Congratulations, you guessed correctly");
	}

	while (nextGuess != randNum) {
		nextGuess = input.nextInt();
		valid = RNG.inputValidation(nextGuess, lowGuess, highGuess);
		if (!valid) {
			nextGuess = input.nextInt();
		}
		System.out.println("Number of guesses is " + RNG.getCount());
		if (nextGuess > randNum) {
			System.out.println("Your guess is too high");
			highGuess = nextGuess;
			System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
		} else if (nextGuess < randNum) {
			System.out.println("Your guess is too low");
			lowGuess = nextGuess;
			System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
		} else {
			System.out.println("Congratulations, you guessed correctly");
		}

	}

	System.out.println("Try again? (yes or no)");
	input.nextLine();
	answer = input.nextLine();

	do {
	if(answer.equalsIgnoreCase("yes")) {
		
		RNG.resetCount();
		randNum = RNG.rand();
		highGuess = 100;
		lowGuess = 0;
	
		System.out.println("Enter your first guess");
		nextGuess = input.nextInt();
		valid = RNG.inputValidation(nextGuess, lowGuess, highGuess);
		if (!valid) {
			nextGuess = input.nextInt();
		}
		System.out.println("Number of guesses is " + RNG.getCount());
		if (nextGuess > randNum) {
			System.out.println("Your guess is too high");
			highGuess = nextGuess;
			System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
		} else if (nextGuess < randNum) {
			System.out.println("Your guess is too low");
			lowGuess = nextGuess;
			System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
		} else {
			System.out.println("Congratulations, you guessed correctly");
		}

		while (nextGuess != randNum) {
			nextGuess = input.nextInt();
			valid = RNG.inputValidation(nextGuess, lowGuess, highGuess);
			if (!valid) {
				nextGuess = input.nextInt();
			}
			System.out.println("Number of guesses is " + RNG.getCount());
			if (nextGuess > randNum) {
				System.out.println("Your guess is too high");
				highGuess = nextGuess;
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
			} else if (nextGuess < randNum) {
				System.out.println("Your guess is too low");
				lowGuess = nextGuess;
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
			} else {
				System.out.println("Congratulations, you guessed correctly");
			}

		}
		System.out.println("Try again? (yes or no)");
		input.nextLine();
		answer = input.nextLine();
	}

}while(answer.equalsIgnoreCase("yes"));

	System.out.println("Thanks for playing...");
	System.exit(0);
	}
	
}

				