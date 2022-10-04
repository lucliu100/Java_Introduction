package Chapter4;

import java.util.Objects;
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("Enter a month: ");
        String month = input.next();
        int days = 0;
        if (Objects.equals(month, "Jan") || Objects.equals(month, "January")) {
            days = 31;
        } else if ((Objects.equals(month, "Feb") || Objects.equals(month, "February")) && (year % 4 == 0)) {
            days = 29;
        } else if ((Objects.equals(month, "Feb") || Objects.equals(month, "February")) && (year % 4 != 0)) {
            days = 28;
        } else if (Objects.equals(month, "Mar") || Objects.equals(month, "March")) {
            days = 31;
        } else if (Objects.equals(month, "Apr") || Objects.equals(month, "April")) {
            days = 30;
        } else if (Objects.equals(month, "May")) {
            days = 31;
        } else if (Objects.equals(month, "June")) {
            days = 30;
        } else if (Objects.equals(month, "July")) {
            days = 31;
        } else if (Objects.equals(month, "Aug") || Objects.equals(month, "August")) {
            days = 31;
        } else if (Objects.equals(month, "Sep") || Objects.equals(month, "September")) {
            days = 30;
        } else if (Objects.equals(month, "Oct") || Objects.equals(month, "October")) {
            days = 31;
        } else if (Objects.equals(month, "Nov") || Objects.equals(month, "November")) {
            days = 30;
        } else if (Objects.equals(month, "Dec") || Objects.equals(month, "December")){
            days = 31;
        }

    System.out.println(month +" "+year +" has "+days +" days");
}
}
