import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);

		int menuChoice;
		String name;
		int population;
		String userContinue = "y";

		System.out.println("Welcome to the Countries Maintenance Application");
		System.out.println("\n");
		printMenu();

		while (userContinue.equalsIgnoreCase("y")) {

			System.out.println("1 - See the lost of countries");
			System.out.println("2 - Add a new country.");
			System.out.println("3 - Exit");

			menuChoice = scnr.nextInt();

			if (menuChoice == 1) {
				CountriesTextFile.readFile();
			}
			if (menuChoice == 2) {
				// add new country

				System.out.println("Enter Country: ");
				name = scnr.nextLine();
				scnr.nextLine();

				System.out.println("Enter population: ");
				population = scnr.nextInt();

				Country c1 = new Country(name, population);
				CountriesTextFile.appendToFile(c1);

				// print list with new country

			}
			if (menuChoice == 3) {
				System.out.println("Goodybye");
			}
			System.out.println("Would you like to continue? (Y/N)");
			scnr.nextLine();
			userContinue = scnr.nextLine();

		}
		scnr.close();

		System.out.println("[Country] , [Population]");
		CountriesTextFile.readFile();

	}

	public static void printMenu() {

	}

}
