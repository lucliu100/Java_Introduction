package Chapter3;

import java.util.Scanner;

public class PredictDayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.println("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.println("Enter the day of the month (1-31): ");
        int dayOfMonth = input.nextInt();
        if (month == 1){
            month = 13;
            year = year - 1;
        }
        if (month == 2){
            month = 14;
            year = year - 1;
        }
        int century = (year / 100);
        int yearOfCentury = year % 100;


        double h = (((dayOfMonth + ((26 * (month + 1))/10)) + yearOfCentury) + (yearOfCentury/4) + (century/4) + (5 * century)) % 7;
        System.out.println(h);
        if (h == 0) {
            System.out.println("The day of the week is Saturday");
        } else if (h == 1) {
            System.out.println("The day of the week is Sunday");
        } else if (h == 2) {
            System.out.println("The day of the week is Monday");
        } else if (h == 3) {
            System.out.println("The day of the week is Tuesday");
        } else if (h == 4) {
            System.out.println("The day of the week is Wednesday");
        } else if (h == 5) {
            System.out.println("The day of the week is Thursday");
        } else if (h == 6) {
            System.out.println("The day of the week is Friday");
        }

    }

}
