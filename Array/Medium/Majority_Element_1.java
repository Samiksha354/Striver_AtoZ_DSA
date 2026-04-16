package Medium;

import java.util.HashMap;
import java.util.Scanner;

public class Majority_Element_1 {
    public static int bruteforce(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > (arr.length/2)){
                return arr[i];
            }
        }
        return -1;
    }
    public static int hashing(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){

        }
return -1;
    }
//    public static int (int[] arr){
//
//    }
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
        System.out.print("  Element:"+bruteforce(arr));
    }
}
