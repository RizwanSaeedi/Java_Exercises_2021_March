// WRITE A PROGRAM TO FIND
// MAX , MIN AND AVERAGE
// VALUE FROM SAMPLE NUMBERS ARRAY

package com.saeedisoft;

public class Exercise3
{
    static int findMax(int marks[])
    {
        int max = 0;
        for (int i = 0; i < marks.length; i++)
        {
            int currentValue = marks[i];
            if (currentValue > max)
            {
                max = currentValue;
            }
        }
        return max;
    }

    static int findMin(int marks[])
    {
        int min = 100000;
        for (int i = 0; i < marks.length; i++)
        {
            int currentValue = marks[i];
            if (currentValue < min)
            {
                min = currentValue;
            }
        }
        return min;
    }

    static int findSum(int marks[])
    {
        int sum = 0;
        for (int i = 0; i < marks.length; i++)
        {
            sum = sum + marks[i];
        }
        return sum;
    }

    static int findAverage(int marks[])
    {

        //forumula = average = sum / count
        int sum = findSum(marks);

        int average = sum / marks.length;
        return average;
    }

    public static void main(String[] args)
    {
        int marks[] = {50, 70, 90, 99, 45};

        int average = findAverage(marks);
        System.out.println(average);
    }
}
