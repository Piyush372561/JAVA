import java.util.Scanner;

public class SI {
    public static void SimpleInterest(double p, double r, double t){
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.println("Enter the time in years: ");
        double t = sc.nextDouble();
        
        SimpleInterest(p, r, t);
    }
}
