package test;

import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {

String title,rating,answer;
		int soldTickets;
		
Scanner input = new Scanner(System.in);
Movie inputmovie = new Movie();

		do {

			System.out.println("Enter the name of a movie");
			inputmovie.setTitle(input.nextLine());

			System.out.println("Enter the rating of the movie");
			inputmovie.setRating(input.nextLine());

			System.out.println("Enter the number of tickets sold for this movie");
			inputmovie.setSoldTickets(input.nextInt());

			System.out.print(inputmovie.getTitle());
			System.out.print(" (" + inputmovie.getRating());
			System.out.println("): Tickets Sold: " + inputmovie.getSoldTickets());
			System.out.println("Do you want to enter another? (y or n)");
			input.nextLine();
			answer=input.nextLine();
		
		}
		while(answer.equalsIgnoreCase("y"));
System.out.println("GoodBye");
System.exit(0);
	}

}
