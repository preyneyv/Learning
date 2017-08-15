package com.example.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pranav Nutalapati on 13 August 17
 */

public class HelloWorld {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Hello, World!");
            System.out.print("What's your name? ");
            String name = reader.readLine();
            System.out.println("Hi, " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
