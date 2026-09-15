import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemC {

    public static void main(String[] args) {

        try {
            // Trying to open a file that does not exist
            File file = new File("recipe.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Recipe file not found.");
        }
    }
}