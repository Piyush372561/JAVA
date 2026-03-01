import java.util.Scanner;

public class pro{
    /*
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double multiply(double a, double b, double c){
        return a * b * c;
    }
     */
    public static void printInfo(String name){
          System.out.println("My name is " + name);
    }
    public static void printInfo(String name, int age){
          System.out.println(" My age is " + age);
    }
    public static void printInfo(String name, int age, String city){
            System.out.println(" I live in " + city);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the value of a: ");
        double a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        double b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        double c = sc.nextInt();
        
        System.out.println(multiply(a,b));
        System.out.println(multiply(a,b,c)); */

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your city: ");
        String city = sc.next();
        printInfo(name);
        printInfo(name, age);
        printInfo(name, age, city);
        
    }
}