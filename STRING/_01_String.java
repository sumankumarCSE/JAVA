package JAVA.STRING;
import java.util.*;
public class _01_String {
    public static void main(String args[]){
        // string declearation
       /*String name="suman";
        String fullName="suman kumar";
        String sentance="my name is suman kumar:";
        System.out.println(name);
        System.out.println(fullName);
        System.out.println(sentance);
       */
    //concatenation

     /*String firstName="suman";
     String lastName="kumar";
     String fullName = firstName+" "+lastName;
     System.out.println(fullName);

     //charAt
     int i;
     for(i=0; i<fullName.length();i++)
     {
        System.out.println(fullName.charAt(i));
     }*/

     // compare

     String name1 = "sumankumar";
     String name2 = "sumankumar";

    //   s1 > s2  : +ve value
    //   s1 = s2  : 0
    //   s1 < s2  : -ve value

   /* if(name1.compareTo(name2)==0)//name1 is s1 
    {
        System.out.println("String is equal:");
    }
    else{
        System.out.println("not equal");
    }*/


    /* error  if(new String("suman") == new String("suman"))
    {
        System.out.println("Equal");
    }
    else{
        System.out.println("not equal");
    }*/

     /* String sentence = "my name i ssuman kumar";
      String name = sentence.substring(7,sentence.length());
      String name3 = sentence.substring(0,5);
      String name4 = sentence.substring(5);
      System.out.println(name);
      System.out.println(name3);
      System.out.println(name4);*/
      //string are immutable

      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      Float j = sc.nextFloat();
      String st = sc.nextLine();
      // Write your code here.

      System.out.println("show in String :"+st);
      System.out.println("Double :"+j);
      System.out.println("Int :"+i);
    
    }    
}

