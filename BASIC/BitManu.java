package JAVA.BASIC;
import java.util.*;

public class BitManu {
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    // Q.1 of get bit
    
    /*int n=5;//0101
    int pos=2;//position 2 par 1 hai //for pos =3 answer is zero
    int bitmask=1<<pos;

    if((bitmask & n) == 0){
        System.out.println("bit was zero:");
    }
    else{
        System.out.println("bit was one:");
    }*/


    //Q.2 set bit

    /*int n=5;//0101
    int pos=1;//position 1 par 0 hai //ans 0111 0 ke jagah 1 set ho gaya
    int bitmask=1<<pos;
    int newNo=bitmask|n;
    System.out.println(newNo);
    */

    //Q.3 clear bit
    
    /*int n=5;//0101
    int pos=2;//position 2 par 1 hai //ans 0001 1 clear ho gaya
    int bitmask=1<<pos;
    int notbitmask = ~(bitmask);
    int newNO = notbitmask & n;
    System.out.println(newNO); 
    */

    //Q.4 update bit
    System.out.print("Enter 1 or 0 which you want to perform:"); 
    int oper = sc.nextInt();
    int n=5;//0101  //pos=1 ans 0111 pos 1 1 hojayega
    int pos=1;//position 1 par 0 hai //if pos =2 ans 0001 pos 2 zero hojayega
    int bitmask=1<<pos;
    


    if(oper == 1){
        int newNo = bitmask | n;
        System.out.println(newNo);
    }
    else{
        int newbitmask=~(bitmask);
        int newNO=newbitmask & n;
        System.out.println(newNO);
    }
    }
}


