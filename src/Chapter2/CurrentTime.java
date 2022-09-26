package Chapter2;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args){
        System.out.println("Enter the time zone offset to GMT: ");
        Scanner input = new Scanner(System.in);
        int offset = input.nextInt();
        System.out.println(java.time.LocalTime.now());
    }
}
