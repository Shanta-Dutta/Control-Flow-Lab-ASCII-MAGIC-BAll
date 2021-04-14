package com.tts;


import java.util.Scanner;
        import java.util.*;

public class AsciiChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name  here:");
        String name = scanner.nextLine();
        System.out.printf("Hello %s\n", name);

        printNumbers();
        printLowerCase();
        printUpperCase();

    }
    public static void printNumbers()

    {
        // TODO: print valid numeric input
       // Ascii number(decimal value) 48 = char 1 and 57 = char 9
        for(int i =48; i <=57 ; i++) {
            String myNum = Character.toString ((char) i);
            System.out.println( "Hello your Ascii num =" + myNum);
        }
    }

    public static void printLowerCase()
    {
        // TODO: print valid lowercase alphabetic
        //Small a to small z  Ascii value -97 to 122
        for(int i =97; i <=122 ; i++) {
            String myLocase = Character.toString ((char) i);
            System.out.println("Hello your Ascii alphabetic =" + myLocase);
        }
    }

    public static void printUpperCase()
    {
        // TODO: print valid uppercase alphabetic input
        // uppercase A to Uppercase Z  Ascii value -65 to 90
        for(int i =65; i <=90 ; i++) {
            String myUpcase = Character.toString ((char) i);
            System.out.println( "Hello your uppercase  alphabetic =" + myUpcase);

        }

    }



}
