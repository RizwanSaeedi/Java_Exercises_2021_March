// write a program to store marks and subjects in 2 arrays
// and display marks of each subjects in console respectively
// with loop

package com.saeedisoft;

public class Exercise4
{
    public static void main(String[] args)
    {
        int marks[] = {50, 60, 77, 99, 100};

        String subjects[] = {"CS101", "CS201", "CS301", "CS401", "CS501"};

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("Subject : " + subjects[i] + " , Marks : " + marks[i]);
        }
    }
}
