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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*  System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Printing numbers from " + n + " to 1:");
        printNumbers(n);
        System.out.println("\nSum of first " + n + " natural numbers: " + sumOfNaturalNumbers(n)); */
        System.out.println("Enter a number to count its digits: ");
        int num = sc.nextInt();
        System.out.println("Number of digits in " + num + " is: " + countDigits(num));

    }
}