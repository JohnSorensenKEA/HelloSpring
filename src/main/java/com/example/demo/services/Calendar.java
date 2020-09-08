package com.example.demo.services;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar
{
    // return format: int {dd,MM,yyyy}
    public int[] getCurrentDate()
    {
        Date myDate = new Date();
        DateFormat dayFormat = new SimpleDateFormat("dd");
        DateFormat monthFormat = new SimpleDateFormat("MM");
        DateFormat yearFormat = new SimpleDateFormat("yyyy");

        int[] date = {Integer.parseInt(dayFormat.format(myDate)),
                Integer.parseInt(monthFormat.format(myDate)),
                Integer.parseInt(yearFormat.format(myDate))};

        return date;
    }

    public int weekDayCalc()
    {
        int[] date = getCurrentDate();

        int q = date[0];
        int m = date[1];
        int j = date[2]/100;
        int k = date[2]%100;

        if(m < 3)
        {
            m += 12;
            k -= 1;
        }

        int h = (q+(13*(m+1))/5+k+k/4+j/4-(2*j))%7;

        int d = ((h + 5)%7) + 1;

        return d;
    }

    public String weekDay()
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

    public String isItFriday()
    {
        String day = weekDay();

        if(day.equals("Friday"))
        {
            return "ITS FUCKING FRIDAY!";
        }
        return "Sadly it's "+day;
    }
}
