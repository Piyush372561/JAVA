import java.util.Scanner;
public class Main {
    //Question-2
    static void countdigit(int n){
        int count = 0;
        int lastdigit;
        while(n > 0){
            lastdigit = n % 10;
            count = count + 1;
            n = n/10;
        }
        System.out.println("No. of digits in a number : " +count);
    }
    //Question-2
    static void ReverseN(int n){
       int lastdigit;
        int reverse = 0;
        while(n > 0){
            lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n/10;
        }
        System.out.println(" Reverse of Original no. :"+reverse);
    }
    //Question-3
    static void checkPalindrome(int n){
        int originalN = n;
        int lastdigit;
        int reverse = 0;
        while(n > 0){
            lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n/10;
        }
        System.out.println(" Reverse of Original no. :"+reverse);
        if(reverse == originalN) {
            System.out.println("The number is a Palondrome number.");
        } else{
            System.out.println("The number is not a palindrome.");
        }
    }

    static void ArmstrongN(int n){
        int lastdigit;
        int dup = n;
        int sum = 0;

          while(n > 0){
            lastdigit = n%10;

            sum = sum + (int)Math.pow(lastdigit,3);
            n = n/10;
          }
          if(sum == dup){
            System.out.println("This is an Armstrong number.");
          } else{
            System.out.println("Not an Armstrong");
          }  
    }    
    
    
    static void printallDivisors1(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
        } 
     }
    }
// Use ArrayList to store 
    static void printallDivisors2(int n){
        for(int i = 1; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(i);
                if((n/i) != i){
                   System.out.println(n/i);
                }
        } 
     }
    }
 
    //Brute force technique.
    static void primeCheck1(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("The number is a prime number.");
        } else{
            System.out.println("The number is not a prime number.");
        }
    }

    //
    static void primeCheck2(int n){
        int count = 0;
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                count++;
                if((n/i) != i){
                    count++;
                }
            }
        }
        if(count == 2){
            System.out.println("The number is a prime number.");
        } else{
            System.out.println("The number is not a prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int N = sc.nextInt(); 
        
        countdigit(N);
        ReverseN(N);
        checkPalindrome(N);
        ArmstrongN(N);
        printallDivisors1(N);
        printallDivisors2(N);
        primeCheck1(N);
        primeCheck2(N);
    }
}