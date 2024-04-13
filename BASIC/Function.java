package JAVA.BASIC;
import java.util.*;
public class Function {
    // public static int calculateSum(int a , int b){
    //     int sum = a+b;
    //     return sum;
    // }
    public static void printFactorial(int n){
        if(n<0){System.out.print("invalid"); return;}
        else if(n==0){System.out.println("factorial=1");return;}
        int factorial =1,i;
        for(i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in) ;
        System.out.print("Enter number:");
        int n=sc.nextInt();     
        // int a=sc.nextInt();     
        // int b=sc.nextInt();
        // int sum=calculateSum(a,b);
        // System.out.println("Sum of 2 numbers is:"+ sum);     
        // System.out.println("Sum of 2 numbers is:"+ calculateSum(a,b)) ;     
        printFactorial(n);
      }
    }

