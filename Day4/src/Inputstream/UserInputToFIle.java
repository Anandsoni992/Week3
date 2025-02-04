package Inputstream;

import java.io.*;

public class UserInputToFIle {
    public static void main(String[] args) {
        String filePath = "E:\\Capg\\Week3\\Day4\\src\\filereader\\file.txt";

        try (
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                FileWriter fw = new FileWriter(filePath, true); // Append mode
                BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.println("Enter text to write to file (type 'exit' to stop):");

            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(input);
                bw.newLine(); // Write each input as a new line
            }

            System.out.println("User input has been saved to " + filePath);

        } catch (
                IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
