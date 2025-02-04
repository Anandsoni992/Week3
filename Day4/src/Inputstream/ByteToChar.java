package Inputstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteToChar {
    public static void main(String[] args) {
        String filePath = "E:\\Capg\\Week3\\Day4\\src\\filereader\\file.txt"; // Change to your file path

        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // Specify charset
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print the file content as characters
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
