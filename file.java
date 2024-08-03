import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class file{
    public static void main(String[] args) {
        String textToWrite = "Computer Science and Engineering";
        String filePath = "example.txt";

        // Write to file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textToWrite);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from file
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            System.out.print("Contents of the file: ");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
