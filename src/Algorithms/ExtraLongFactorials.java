package Algorithms;

import java.math.BigInteger;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger fact = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));

        }

        System.out.println(fact);

    }
}