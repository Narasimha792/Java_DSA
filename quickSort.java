// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class quickSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
        public static int partition(int arr[],int low,int high){
            int p=arr[high];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(arr[j]<p){
                    i++;
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;
            
            return i+1;
        }
    }
