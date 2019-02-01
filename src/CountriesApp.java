import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		int menuChoice;
		String name;
		int population;

		printMenu();

		Scanner scnr = new Scanner(System.in);
		menuChoice = scnr.nextInt();

		if (menuChoice == 1) {
			CountriesTextFile.readFile();
		}
		if (menuChoice == 2) {
			// add new country

			System.out.println("New country name: ");
			name = scnr.nextLine();
			scnr.nextLine();

			System.out.println("Enter population: ");
			population = scnr.nextInt();

			Country c1 = new Country(name, population);
			CountriesTextFile.appendToFile(c1);

			// print list with new country

		}
		if (menuChoice == 3) {
			// goodbye

		}

	}

	public static void printMenu() {
		System.out.println("Welcome to the Countries Maintenance Application");
		System.out.println("\n");
		System.out.println("1 - See the lost of countries");
		System.out.println("2 - Add a new country.");
		System.out.println("3 - Exit");

	}

}
