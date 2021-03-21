package com.saeedisoft;

public class SubjectMark
{
    // data members
    private int mark;
    private String subject;

    public SubjectMark(int mark, String subject)
    {
        this.mark = mark;
        this.subject = subject;
    }

    public int getMark()
    {
        return mark;
    }

    public void setMark(int mark)
    {
        this.mark = mark;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }
}
