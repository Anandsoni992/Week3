package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comparing {
    public static void main(String[] args){
        int iterations = 1_000_000;
        String text = "hello";
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;

        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " ns");
        String filepath = "E:\\Capg\\Week3\\Day4\\src\\challenge\\100mb-examplefile-com.txt";
        int count = 0 ;
        try(BufferedReader bf = new BufferedReader(new FileReader(filepath))){
            String line ;
            while((line=bf.readLine()) != null) {
                count++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Total Count of words in 100mb file: "+ count);
    }
}
