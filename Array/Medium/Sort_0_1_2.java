package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_0_1_2 {
    public static int[] bruteforce(int[] arr){
       Arrays.sort(arr);  // sort happens here  //Arrays.sort(arr) does not return an array.
        return arr;// return sorted array
    }
    public static int[] better(int [] arr){
        int c0=0,c1=0,c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) c0++;
            else if (arr[i] == 1) c1++;
            else c2++;
        }
        for(int i=0;i<c0;i++){
            arr[i]=0;
        }
        for(int i=c0;i<c0+c1;i++){
            arr[i]=1;
        }
        for(int i=c0+c1;i<arr.length;i++){
            arr[i]=2;
        }


        return arr;
    }
    public static int[] Dutch_national_flag(int [] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;

            }
            else if(arr[mid]==1){
                mid++;

            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;

                high--;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

       int[] grr=bruteforce(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(grr[i] + " ");
        }
        System.out.println();
        int[] brr=better(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(brr[i] + " ");
        }



        System.out.println();
        int[] krr=Dutch_national_flag(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(krr[i] + " ");
        }

    }

}
