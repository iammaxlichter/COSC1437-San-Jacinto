package CHAPTER7;


import java.util.*;
public class DebugSeven2
{
    public static void main(String[] args) {

        String str;
        int x;
        int length;
        int num;
        int lastSpace = -1;
        int sum = 0;
        String partStr;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a series of integers separated by spaces >> ");
            str = in.nextLine();
        }
        length = str.length();

        for(x = 0; x < length; ++x) {
            if(str.charAt(x) == ' ') {
                partStr = str.substring(lastSpace + 1,x );
                num = Integer.parseInt(partStr);
                System.out.println(" " + num);
                sum = sum + num;
                lastSpace = x; //*****Error Here*****
            }
        }

        partStr = str.substring(lastSpace + 1, length);
        num = Integer.parseInt(partStr);
        System.out.println(" " + num);
        sum =sum + num;

        System.out.println(" -------------------" + "\nThe sum of the integers is " + sum);
    }
}