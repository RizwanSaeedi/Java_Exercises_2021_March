// write a program to store marks and subject name with class
// make class and save objects in arraylist and display

package com.saeedisoft;

import java.util.ArrayList;
import java.util.List;

public class Exercise5
{
    public static void main(String[] args)
    {

        List<SubjectMark> dataList = new ArrayList<>();

        SubjectMark object1 = new SubjectMark(70, "CS101");
        SubjectMark object2 = new SubjectMark(60,"CS201");

        dataList.add(object1);
        dataList.add(object2);


        for (int i = 0; i < dataList.size(); i++)
        {
            SubjectMark object = dataList.get(i);
            System.out.println("Subject : " + object.getSubject() + " , Marks : " + object.getMark());
        }
    }
}
