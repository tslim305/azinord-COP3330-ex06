package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current age?");
        String age = scan.next();
        int age1 = Integer.parseInt(age);

        System.out.println("At what age would you like to retire?");
        String r_age = scan.next();
        int r_age1 = Integer.parseInt(r_age);

        int  yrs_left = r_age1 - age1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retire_yr = year +  yrs_left;

        System.out.println("You have " + yrs_left + " years left until you can retire.");
        System.out.println("It's " + year +" , so you can retire in "+ retire_yr + ".");



    }
}
