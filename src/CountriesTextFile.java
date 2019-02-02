import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CountriesTextFile {

	private static Path filePath = Paths.get("countries.txt");

	public static void appendToFile(Country country) throws IOException {
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}

		List<String> countryList = Arrays.asList(country.toString());

		Files.write(filePath, countryList, StandardOpenOption.APPEND);
	}

	public static void readFile() throws IOException {
		List<String> lines = Files.readAllLines(filePath);

		for (String thisLine : lines) {
			System.out.println(thisLine);
		}
	}
}
