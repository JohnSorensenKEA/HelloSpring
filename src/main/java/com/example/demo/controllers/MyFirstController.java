package com.example.demo.controllers;

import com.example.demo.services.Calendar;
import com.example.demo.services.WorldSimplestCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController
{
    @GetMapping("/friday")
    @ResponseBody
    public String friday()
    {
        return Calendar.isItFriday();
    }


    //http://localhost:8080/echo?phraseToEcho=Hello
    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam String phraseToEcho)
    {
        return phraseToEcho;
    }

    @GetMapping("/calc")
    @ResponseBody
    public int calc(@RequestParam int number)
    {
        WorldSimplestCalculator calculator = new WorldSimplestCalculator();

        int result = calculator.returnProduct(number);

        return result;
    }


    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld()
    {
        return "Hello World";
    }

    @GetMapping("/world")
    @ResponseBody
    public String world()
    {
        return "World3orldvvorldMorld";
    }

    @GetMapping("/")
    @ResponseBody
    public String frontPage()
    {
        return "Front Page";
    }

    @GetMapping("/hello/hello")
    @ResponseBody
    public String awesome()
    {
        return "Hello Hello Hello, anybody there?";
    }
}
