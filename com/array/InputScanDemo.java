package com.array;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.stream.Stream;

public class InputScanDemo {


    public static void main(String pars[])
    {
        LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 11);//line 1
        LocalDate date2 = LocalDate.of(2016, 11, 12);
        System.out.println(date1.compareTo(date2));
    }

    }
