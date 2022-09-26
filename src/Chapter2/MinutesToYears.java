package Chapter2;

import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] args){
        System.out.println("Enter the number of minutes: ");
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440; //divides the remainder by the # of minutes in a day
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
