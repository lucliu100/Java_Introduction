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
        if (Objects.equals(month, "Jan")) {
            days = 31;
        } else if ((Objects.equals(month, "Feb") && (year % 4 == 0))) {
            days = 29;
        } else if ((Objects.equals(month, "Feb") && (year % 4 != 0)) ){
            days = 28;
        } else if (Objects.equals(month, "Mar")) {
            days = 31;
        } else if (Objects.equals(month, "Apr")) {
            days = 30;
        } else if (Objects.equals(month, "May")) {
            days = 31;
        } else if (Objects.equals(month, "Jun")) {
            days = 30;
        } else if (Objects.equals(month, "Jul")) {
            days = 31;
        } else if (Objects.equals(month, "Aug")) {
            days = 31;
        } else if (Objects.equals(month, "Sep")) {
            days = 30;
        } else if (Objects.equals(month, "Oct")) {
            days = 31;
        } else if (Objects.equals(month, "Nov")) {
            days = 30;
        } else if (Objects.equals(month, "Dec")){
            days = 31;
        }

    System.out.println(month +" "+year +" has "+days +" days");
}
}
