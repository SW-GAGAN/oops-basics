package com.prectice.basics;

import static java.lang.System.*;

public class SwitchDemo {
    public static void main(String[] args) {
        int month = 8;
        String monthString;

        switch (month) {
            case 1:
                monthString = "jan";
                break;
            case 2:
                monthString = "Feb";
                break;
            case 3:
                monthString = "Mar";
                break;
            case 4:
                monthString = "Apr";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "june";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
                System.out.println("Month name is :" + monthString);
        }
    }
