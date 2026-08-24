package Easy;

import java.util.Scanner;

public class Remove_Duplicates_from_sorted_array {

    public static void main(String[] args){
        Scanner ssc=new Scanner(System.in);
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
    }
}
