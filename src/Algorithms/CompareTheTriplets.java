package Algorithms;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int a = 0, b = 0;
        if (a0 >= 1 || a0 <= 100 && b0 >= 1 || b0 <= 100 && a1 >= 1 || a1 <= 100 && a2 >= 1 || a2 <= 100 && b1 >= 1 || b1 <= 100 && b2 >= 1 || b2 <= 100) {

            if (a0 > b0)
                a++;
            else if (a0 < b0)
                b++;
            if (a1 > b1)
                a++;
            else if (a1 < b1)
                b++;

            if (a2 > b2)
                a++;
            else if (a2 < b2)
                b++;


            System.out.println(a + " " + b);
        }
    }
}
