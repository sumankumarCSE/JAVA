package JAVA.BASIC;
import java.util.Scanner;
public class Pattern2{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n from:");
    int n = sc.nextInt();
    int i,j;

//Q.1

    //upper part

 /* for(i=1;i<=n;i++) // for single line use here n-1
    {
        for(j=1;j<=i;j++) 
        {
            System.out.print("*");
        }
        for(j=2*i;j<2*n;j++) // here spaces is 2*(n-i)
        {
           System.out.print(" ");
        }
        for(j=1;j<=i;j++) 
        {
            System.out.print("*");
        }
    System.out.println();
    }
 
// lower part    
    for(i=n;i>=1;i--)
    {
        for(j=i;j>=1;j--)
        {
            System.out.print("*");
        }
        for(j=2*i;j<2*n;j++)
        {
           System.out.print(" ");
        }
        for(j=i;j>=1;j--)
        {
            System.out.print("*");
        }
    System.out.println();
    }*/

// Q.2

/*for(i=1;i<=n;i++)
{
    for(j=i;j<n;j++)
    {
        System.out.print(" ");
    }
    for(j=1;j<=n;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}*/

//Q.3

/*for(i=1;i<=n;i++)
{
    for(j=i;j<n;j++)
    {
        System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
        System.out.print(i);
        System.out.print(" ");
    }
    System.out.println();
} */

//Q.4

/*for(i=1;i<=n;i++)
{
    for(j=i;j<n;j++)
    {
        System.out.print(" ");
    }
    for(j=i;j>=1;j--)
    {
        System.out.print(j);      
    }
    for(j=2;j<=i;j++)
    {
        System.out.print(j);
        //System.out.print(" ");
    }
    System.out.println();
}*/

//Q.5

// upper part
for(i=1;i<=4;i++) // for single  line remove equal to 
{
    for(j=i;j<n;j++)
    {
        System.out.print("  ");
    }
    for(j=1;j<=i;j++)
    {
        System.out.print(" *");
    }
    for(j=2;j<=i;j++)
    {
        System.out.print(" *");
    }
    System.out.println();
}

// lower part

for(i=1;i<=n;i++)
{
    for(j=1;j<i;j++)
    {
        System.out.print("  ");
    }
    for(j=i;j<=n;j++)
    {
        System.out.print(" *");
    }
    for(j=i+1;j<=n;j++)
    {
        System.out.print(" *");
    }
    System.out.println();
}

    }
}

