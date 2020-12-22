package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        // write your code here
            Scanner s = new Scanner(System.in);
            System.out.print(LongestWord(s.nextLine()));


    }

    public static String LongestWord(String sen) {
        StringTokenizer stringTokenizer = new StringTokenizer(sen, " \t\n!@#$%^&*()\\/'\"-_+=.,");
        String firstString = stringTokenizer.nextToken();
        String secondString = stringTokenizer.nextToken();
        if (firstString.length() > secondString.length() || firstString.length() == secondString.length()) {
            return firstString;

        } else
            return secondString;
    }
}
