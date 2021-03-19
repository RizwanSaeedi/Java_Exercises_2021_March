// write a program to get answer of add , subtract
// multiply , divide using functions

package com.saeedisoft;

import jdk.jshell.spi.ExecutionControl;

public class Exercise2
{
    static int add(int a, int b)
    {
        int answer = a + b;
        return answer;
    }

    static int subtract(int a, int b)
    {
        int answer = a - b;
        return answer;
    }

    static int multiply(int a, int b)
    {
        int answer = a * b;
        return answer;
    }

    static int divide(int a, int b)
    {
        int answer = a / b;
        return answer;
    }

    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;

        System.out.println("v1 = " + x + " , v2 = " + y);

        int answer = add(x, y);
        System.out.println("ADD");
        System.out.println(answer);
        System.out.println("-----------");

        answer = subtract(x, y);
        System.out.println("SUBTRACT");
        System.out.println(answer);
        System.out.println("-----------");

        answer = multiply(x, y);
        System.out.println("MULTIPLY");
        System.out.println(answer);
        System.out.println("-----------");

        answer = divide(x, y);
        System.out.println("DIVIDE");
        System.out.println(answer);
        System.out.println("-----------");
    }


}
