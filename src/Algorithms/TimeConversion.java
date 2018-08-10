package Algorithms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {

        String timeArr[]=s.split(":");
        String hh=timeArr[0];
        String mm=timeArr[1];
        String ss=timeArr[2].substring(0, 2);
        Integer h=Integer.parseInt(hh);

        String time=s.substring(s.length()-2);
        if(time.equals("AM"))
        {
            if(hh.equals("12"))
                return "00:"+mm+":"+ss;

            return s.substring(0, s.length()-2);
        }
        if(time.equals("PM") && h<12)
        {
            h+=12;
            return h+":"+mm+":"+ss;
        }
        if(time.equals("PM") && h==12)
        {
            h+=0;
            return h+":"+mm+":"+ss;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}