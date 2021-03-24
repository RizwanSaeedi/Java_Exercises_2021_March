// write a program print your name 5 times using loop
// and function

package com.saeedisoft;

public class Exercise8
{
    public static void main(String[] args)
    {
        System.out.println(showMyName("Akram", 50));
    }

    static String showMyName(String name, int times)
    {
        String output = "";
        for (int i = 0; i < times; i++)
        {
            output += i + 1 + " " + name + "\n";
        }
        return output;
    }
}
