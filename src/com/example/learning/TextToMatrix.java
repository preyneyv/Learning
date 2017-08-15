package com.example.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextToMatrix {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new InputStreamReader(System.in));

            String[] line = null;
            int rows = 0;
            int cols = 0;
            System.out.println("Please enter a line of text:");
            String text = reader.readLine().toUpperCase();
            while(rows * cols < text.length()) {
                System.out.println("Please enter values that, when multiplied, \n" +
                        "give at least the length of your text("+ text.length() +").");
                line = reader.readLine().split(" ");
                rows = Integer.parseInt(line[0]);
                cols = Integer.parseInt(line[1]);
            }
            System.out.println();
            int pos = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if(pos < text.length()) {
                        System.out.print(text.substring(pos, pos+1) + " ");
                        pos++;
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
