package Chapter1;

public class LinearSystem {
    public static void main(String[] args) {
        double A = 3.4;
        double B = 50.2;
        double C = 2.1;
        double D = 0.55;
        double x = ((44.5 * D)-(B * 5.9))/((A * D) - (B * C));
        double y = ((A * 5.9) - (44.5 * C))/((A * D) - (B * C));
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
