package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurences {
    public static void main(String[] args){
        String filepath = "E:\\Capg\\Week3\\Day4\\src\\filereader\\file.txt";
        String target = "I";
        int count = 0 ;
        try(BufferedReader bf = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line=bf.readLine()) != null){
                System.out.println(line);
                String[] arr = line.split(" ");
                for(String word : arr){
                    if(word.equals(target)){
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Total Count of I in the File is: "+ count);
    }
}
