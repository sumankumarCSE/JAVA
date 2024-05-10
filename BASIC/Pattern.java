package JAVA.BASIC;
import java.util.Scanner;
public class Pattern {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n:");
    int n = sc.nextInt();
    int i,j,k;
    System.out.println("Question no");
    //Q.1 squre
    //  for(i=0;i<n;i++)
    // {
    //     for(j=0;j<n;j++)
    //     {
    //         System.out.print(" *");
    //     }
    //     System.out.print("\n");
    // }
    System.out.println("Question no-1");
    //Q.2 
  /*for(i=0;i<n;i++)
    {
        for(j=i;j<n;j++)
        {
            System.out.print(" *");
        }
        System.out.print("\n");
    }*/
  
    // Q.3
    System.out.println("Question no 3");
   /* for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            System.out.print(" *");
        }
        System.out.print("\n");
    }*/

    // Q.4
    System.out.println();
   /*  for(i=0;i<n;i++)
    {
        for(j=i;j>0;j--)
        {
            System.out.print(" ");
        }
        for(k=i;k<n;k++)
        {
        System.out.print("*");
        }
        System.out.print("\n");
    }*/

    // Q.5

   /*  for(i=0;i<n;i++)
    {
        for(j=n-1;j>i;j--)
        {
            System.out.print(" ");
        }
        for(k=i;k>-1;k--)
        {
        System.out.print("*");
        }
        System.out.print("\n");
    }*/

    // Q.6
   /*  for(i=n;i>=1;i--)
    {
        for(j=1;j<i;j++)
        {
            System.out.print(j);
        }
        System.out.print("\n");
    }*/

   // Q.7
 
 /*   k=0;
for(i=1;i<n;i++)
    {
        for(j=1;j<i;j++)
        {
            k++;
            System.out.print(k);
        }
        System.out.print("\n");
    }*/

//Q.8
    k=0;
    for(i=1;i<n;i++)
    {
        for(j=1;j<i;j++)
        {
            k++;
            if(k%2==0)
            {
                System.out.print("0");
            }
            else
            {
                System.out.print("1");
            }
        }
        System.out.print("\n");
    }
    
// Q.9  O type pattern
    // for(i=1;i<=n;i++)
    // {
    //     for(j=1;j<=n;j++)
    //     {
    //         if(i==1|| i==n || j==1 || j==n)
    //        {
    //         System.out.print("*");
    //        } 
    //         else
    //         {
    //             System.out.print(" ");
    //         }
    //     }   
    //     System.out.print("\n");
        
    // }
    }
}


