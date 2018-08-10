package Algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamleClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();

        int count = 1;
        int i = 0;

        while (i < len) {
            if (Character.isUpperCase(s.charAt(i)))
                count++;

            i++;

        }

        System.out.println(count);

    }
}
