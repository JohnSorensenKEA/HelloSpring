package com.example.demo.services;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar
{
    public static int weekDayCalc()
    {
        Date myDate = new Date();
        DateFormat dayFormat = new SimpleDateFormat("dd");
        DateFormat monthFormat = new SimpleDateFormat("MM");
        DateFormat yearFormat = new SimpleDateFormat("yyyy");

        int q = Integer.parseInt(dayFormat.format(myDate));
        int m = Integer.parseInt(monthFormat.format(myDate));
        int j = Integer.parseInt(yearFormat.format(myDate))/100;
        int k = Integer.parseInt(yearFormat.format(myDate))%100;

        if(m < 3)
        {
            m += 12;
            k -= 1;
        }

        int first = (13*(m+1))/5;
        int second = k/4;
        int third = j/4;

        int h = (q+first+k+second+third-(2*j))%7;

        int d = ((h + 5)%7) + 1;

        return d;
    }

    public static String weekDay()
    {
        int day = weekDayCalc();

        switch (day)
        {
            case 1:
            {
                return "Monday";
            }
            case 2:
            {
                return "Tuesday";
            }
            case 3:
            {
                return "Wednesday";
            }
            case 4:
            {
                return "Thursday";
            }
            case 5:
            {
                return "Friday";
            }
            case 6:
            {
                return "Saturday";
            }
            case 7:
            {
                return "Sunday";
            }
            default:
            {
                return "idk, christmas?";
            }
        }
    }

    public static String isItFriday()
    {
        String day = weekDay();

        if(day.equals("Friday"))
        {
            return "ITS FUCKING FRIDAY!";
        }
        return "Sadly it's "+day;
    }
}
