package stringconcatenationcomparison;

import java.util.Random;

public class StringConcatenationComparison {

    public static void compareStringConcatenation(int size) {
        String text = "a";

        // Using String
        long startTime = System.nanoTime();
        String result = "";
        for (int i = 0; i < size; i++) {
            result += text;
        }
        long stringTime = System.nanoTime() - startTime;

        // Using StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(text);
        }
        long stringBuilderTime = System.nanoTime() - startTime;

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sbf.append(text);
        }
        long stringBufferTime = System.nanoTime() - startTime;

        System.out.printf("Operations Count: %,d | String: %,dns | StringBuilder: %,dns | StringBuffer: %,dns\n", size, stringTime, stringBuilderTime, stringBufferTime);
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        for (int size : datasetSizes) {
            compareStringConcatenation(size);
        }
    }
}
