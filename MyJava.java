import java.util.Scanner;
public class MyJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Variable1: ");
        int Var1 = sc.nextInt();
        System.out.print("Enter Variable2: ");
        int Var2 = sc.nextInt();
        //Ques -1
        /* 
        if(++Var1 < 10 && ++Var2 > 15){
            Var1++;
        }else{
          Var2++;  
        } */
        
       //Ques -2
    
        if(++Var1 < 10 || ++Var2 > 15){
            Var1++;
        }else{
          Var2++;  
        }
        //Ques -3
    /*  
    if(++Var1 < 10 & ++Var2 > 15){
            Var1++;
        }else{
          Var2++;  
        } */
        //Ques - 4
    /*
    if(++Var1 < 10 | ++Var2 > 15){
            Var1++;
        }else{
          Var2++;  
        } */
        
        System.out.println(Var1+" "+Var2);
    }
} 