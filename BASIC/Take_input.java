package JAVA.BASIC;
import java.util.*;
public class Take_input {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String name1 = sc.next();
    String name2 = sc.nextLine();
    System.out.println(name2);
    System.out.println(name1);
    System.out.println("sum"); //hello
    int a = sc.nextInt();
    float b = sc.nextFloat();
    float sum = a+b;
    System.out.println(sum); 
   }
}

