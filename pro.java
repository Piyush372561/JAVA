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
     
    public static void printInfo(String name){
          System.out.println("My name is " + name);
    }
    public static void printInfo(String name, int age){
          System.out.println(" My age is " + age);
    }
    public static void printInfo(String name, int age, String city){
            System.out.println(" I live in " + city);
    } 

     public static int max(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b, double c){
        if(a > b && a > c){
            return a;
        } else if(b > a && b > c){
            return b;
        } else {
            return c;
        }
    }

    public static int max(double a, double b){
        if(a > b){
            return (int) a;
        } else {
            return (int) b;
        }
    }

    public static int calculate(int a, int b){
      return a + b;
    }

    public static double calculate(double a, double b){
        return a - b;
    }

    public static void calculate(int a, int b, char op){
         if(op == '+'){
            System.out.println(a + b);
            } else if(op == '-'){
                System.out.println(a - b);
            } else if(op == '*'){
                System.out.println(a * b);
            } else if(op == '/'){
                System.out.println(a / b);
            } else {
                System.out.println("Invalid operator");
            }
    }
            */
           public static int power(int base, int exponent){
            int result = 1;
            for(int i = 0; i < exponent; i++){
                result *= base;
            }
            return result;
           }
           public static double power(double base, int exponent){
            double result = 1;
            for(int i = 0; i < exponent; i++){
                result *= base;
            }
            return result;
           }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of a: ");
        // double a = sc.nextInt();
        // System.out.println("Enter the value of b: ");
        // double b = sc.nextInt();
       // System.out.println("Enter the value of c: ");
       // double c = sc.nextInt();
        /* 
        System.out.println(multiply(a,b));
        System.out.println(multiply(a,b,c)); 

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your city: ");
        String city = sc.next();
        printInfo(name);
        printInfo(name, age);
        printInfo(name, age, city);
         
        System.out.println(max(a,b));
        System.out.println(max(a,b,c));
        System.out.println(max(a,b));
        
        System.out.println(calculate(a,b));
        System.out.println(calculate(a,b));
            System.out.println("Enter the operator: ");
            char op = sc.next().charAt(0);
            calculate((int) a, (int) b, op);
        */
            System.out.println("Enter base: ");
            int base = sc.nextInt();
            System.out.println("Enter exponent: ");
            int exponent = sc.nextInt();
            System.out.println(power(base, exponent));
            System.out.println(power(base, exponent));
    }
}