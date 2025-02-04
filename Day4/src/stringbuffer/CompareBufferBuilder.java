package stringbuffer;

import java.util.Scanner;

public class CompareBufferBuilder {
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
    }
}
