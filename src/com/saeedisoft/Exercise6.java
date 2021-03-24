// write a program to print table of 5  from 1 to 10 and then 10 to 1


package com.saeedisoft;

public class Exercise6
{
    public static void main(String[] args)
    {
        System.out.println(getTableOfNumber(6, false));
        System.out.println(getTableOfNumber(7, true));
        System.out.println(getTableOfNumber(8, true));
    }

    static String getTableOfNumber(int number, boolean isReverse)
    {
        String ouput = "";
        if (isReverse)
        {
            for (int i = 10; i >= 1; i--)
            {
                ouput += (number + " x " + i + " = " + (number * i)) + "\n";
            }
        } else
        {
            for (int i = 1; i <= 10; i++)
            {
                ouput += (number + " x " + i + " = " + (number * i)) + "\n";
            }
        }
        return ouput;
    }
}
