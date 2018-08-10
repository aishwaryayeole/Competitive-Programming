package Algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatsAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int ca, cb, mc;
            ca = Math.abs(x - z);
            cb = Math.abs(y - z);

            if (ca < cb)
                System.out.println("Cat A");
            else if (cb < ca)
                System.out.println("Cat B");
            else
                System.out.println("Mouse C");


        }
    }
}