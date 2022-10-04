package Chapter4;

import java.util.Scanner;

public class OrderCities {
    public static void main(String[] args) {
        System.out.println("Enter the first city: ");
        Scanner input = new Scanner(System.in);
        String city1 = input.next();
        System.out.println("Enter the second city: ");
        String city2 = input.next();
        System.out.println("Enter the third city: ");
        String city3 = input.next();
        int n = 3;
        String[] cities = {city1, city2, city3};
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // to compare one string with other strings
                if (cities[i].compareTo(cities[j]) > 0) {
                    // swapping
                    temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }
        System.out.println("The three cities in alphabetical order are ");
        for (int i = 0; i < n; i++) {
            System.out.println(cities[i]);
        }

    }
}
