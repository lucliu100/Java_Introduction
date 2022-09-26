package Chapter1;

public class PopulationProjection {
    public static void main(String[] args) {
        int dailyBirth = 86400/7;
        int yearlyBirth = dailyBirth * 365;
        int dailyDeath = 86400/13;
        int yearlyDeath = dailyDeath * 365;
        int dailyImmigrant = 86400/45;
        int yearImmigrant = dailyImmigrant * 365;
        int currentPopulation = 312032486;
        int oneYear = ((currentPopulation + yearlyBirth) - yearlyDeath) + yearImmigrant;
        int twoYear = ((currentPopulation + (2 * yearlyBirth)) - (2 * yearlyDeath)) + (2 * yearImmigrant);
        int threeYear = ((currentPopulation + (3 * yearlyBirth)) - (3 * yearlyDeath)) + (3 * yearImmigrant);
        int fourYear = ((currentPopulation + (4 * yearlyBirth)) - (4 * yearlyDeath)) + (4 * yearImmigrant);
        int fiveYear = ((currentPopulation + (5 * yearlyBirth)) - (5 * yearlyDeath)) + (5 * yearImmigrant);
        System.out.println("Current Population : " + currentPopulation);
        System.out.println("After 1 year: " + oneYear);
        System.out.println("After 2 years: " + twoYear);
        System.out.println("After 3 years: " + threeYear);
        System.out.println("After 4 years: " + fourYear);
        System.out.println("After 5 years: " + fiveYear);

    }
}
