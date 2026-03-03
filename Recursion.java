import java.util.Scanner;
public class Recursion{
   /*  //Question-1 : Write a recursive function to print numbers from n to 1.
    public static void printNumbers(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }
    //Question-2 : Write a Sum of First N Natural Numbers using Recursion.
    public static int sumOfNaturalNumbers(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
     */

    //Question-3 : Write a recursive function to count the number of digits in a given number.
    public static int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n / 10);
    } 

    //Question-4 : write a recursive function to reverse a number.
    public static int reverseNumber(int n){
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }
    //Question-5 : Write a recursive function to find the palindrome of a given number.
    public static boolean isPalindrome(int n){
        int rev = reverseNumber(n);
        return n == rev;
    }
    //Question-6 : Write a recursive function to find fibonacci series up to n terms.
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //Question-7 : Write a recursive function to find power using recursion.
    public static int power(int base, int exp){
        if(exp == 0){
            return 1;
        }
        return base * power(base, exp - 1);
    }
    //Question-8 : Write a recursive function to find the GCD of two numbers.
    public static int gcd(int a, int b){
        if(b == 0){
            return 0;
        } else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*  System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Printing numbers from " + n + " to 1:");
        printNumbers(n);
        System.out.println("\nSum of first " + n + " natural numbers: " + sumOfNaturalNumbers(n)); 
        System.out.println("Enter a number to count its digits: ");
        int num = sc.nextInt();
        System.out.println("Number of digits in " + num + " is: " + countDigits(num));

        System.out.println("Enter a number to reverse: ");
        int numberToReverse = sc.nextInt();
        System.out.println("Reversed number: " + reverseNumber(numberToReverse));

        System.out.println("Enter a number to check if it is palindrome: ");
        int numberToCheck = sc.nextInt();
        System.out.println("Is " + numberToCheck + " a palindrome? " + isPalindrome(numberToCheck));

        System.out.println("Enter the number of terms for Fibonacci series: ");
        int terms = sc.nextInt();
        System.out.println("Fibonacci series up to " + terms + " terms:");
        for(int i = 0; i < terms; i++){
            System.out.print(fibonacci(i) + " ");
        } 
  
        System.out.println("\nEnter base and exponent to calculate power: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(base + " raised to the power of " + exp + " is: " + power(base, exp)); */
        
        System.out.println("Enter two numbers to find their GCD: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b) + " is the GCD of " + a + " and " + b);
    }
}