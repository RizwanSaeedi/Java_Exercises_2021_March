// write a program to print even and odd numbers using loops
// functions

package com.saeedisoft;

public class Exercise7
{
    public static void main(String[] args)
    {
        System.out.println(displayOddNumbers(1, 100));
    }

    static String displayEvenNumbers(int from, int to)
    {
        String output = "";
        for (int i = from; i <= to; i++)
        {
            if ((i % 2) == 0)
            {
                output += i + "\n";
            }
        }
        return output;
    }


    static String displayOddNumbers(int from, int to)
    {
        String output = "";
        for (int i = from; i <= to; i++)
        {
            if ((i % 2) != 0)
            {
                output += i + "\n";
            }
        }
        return output;
    }
}
