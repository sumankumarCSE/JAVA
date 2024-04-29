package JAVA.ARRAY;
import java.util.Scanner;
public class AlternetSwap {
    //Q.1
    public static void swapA(int arr[],int n){
        for(int i=0;i<n;i+=2){
         if(i+1<n){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            }
        }
    }
    public static void printA(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }   
    }
// Q.2
    public static void Duplicate(int arr[],int n)
    {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                System.out.println("Duplicate value present in Given Arrya:"+arr[i]);
            }
            }
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter the size of array:");
    int n=sc.nextInt(); 
    int[] arr = new int[n];
    System.out.println("Enter array Element:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    } 
    // for(int i=0;i<n;i++){
    //     if(i%2==0){
    //         int temp=arr[i];
    //         arr[i]=arr[i+1];
    //         arr[i+1]=temp;
    //     }
    // }
    //printA(arr,n);
    System.out.println();
    swapA(arr,n);
    System.out.println();
    printA(arr,n);
    Duplicate(arr,n);
    }
}
