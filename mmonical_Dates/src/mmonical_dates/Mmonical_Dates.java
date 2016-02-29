/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmonical_dates;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class Mmonical_Dates
{
    public static void main (String [] args)
    {
        Scanner get = new Scanner (System.in);
        int year1, year2, month1, month2, day1, day2;
        boolean invalid, leapYear1, leapYear2;
  
        do
        {
            invalid = true;
            System.out.print("Enter a date: ");
            year1 = get.nextInt();
 
            if ( year1 < 1900 || year1 > 2400 )
            {
                continue;
            }
            System.out.print("Enter a month: ");
             
            month1 = get.nextInt();
            if ( month1 < 1 || month1 > 12 )
            {
                continue;
            }
            if(year1 % 4 != 0){
                leapYear1 = false;
            }
            else if (year1 % 100 != 0){
                leapYear1 = true;
            }
            else 
                leapYear1 = year1 % 400 == 0;
            System.out.print("Enter a day: ");
            day1 = get.nextInt();
            if (day1 < 1){
                continue;
            }
            if (leapYear1 && month1 == 2){
                if (day1 > 29)
                    continue;
            }
            else {
                if (month1 == 2){
                    if (day1 > 28)
                        continue;
                }
                else if (month1 % 2 == 1){
                    if (month1 <= 7){
                        if (day1 > 31)
                            continue;
                    }
                    else if (day1 > 30)
                            continue;
                }
                else {
                    if (month1 <= 7){
                        if (day1 > 30)
                            continue;
                    }
                    else if (day1 > 31)
                        continue;
                }
            }
            invalid = false;
        }while ( invalid );
        
        do
        {
            invalid = true;
            System.out.print("Enter a date: ");
            year2 = get.nextInt();
 
            if ( year2 < 1900 || year2 > 2400 )
            {
                continue;
            }
            System.out.print("Enter a month: ");
             
            month2 = get.nextInt();
            if ( month2 < 1 || month2 > 12 )
            {
                continue;
            }
            if(year2 % 4 != 0){
                leapYear2 = false;
            }
            else if (year2 % 100 != 0){
                leapYear2 = true;
            }
            else 
                leapYear2 = year2 % 400 == 0;
            System.out.print("Enter a day: ");
            day2 = get.nextInt();
            if (day2 < 1){
                continue;
            }
            if (leapYear2 && month2 == 2){
                if (day2 > 29)
                    continue;
            }
            else {
                if (month2 == 2){
                    if (day2 > 28)
                        continue;
                }
                else if (month2 % 2 == 1){
                    if (month2 <= 7){
                        if (day2 > 31)
                            continue;
                    }
                    else if (day2 > 30)
                            continue;
                }
                else {
                    if (month2 <= 7){
                        if (day2 > 30)
                            continue;
                    }
                    else if (day2 > 31)
                        continue;
                }
            }
            invalid = false;
        }while ( invalid );
    }      
}






























