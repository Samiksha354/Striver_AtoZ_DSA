package Medium;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import static java.util.Collections.sort;


public class Two_Sum {

    //brute force -we can also use for loop here
    public static boolean twosumgo(int[] arr,int target){
        int i=0;
        int n=arr.length;
        while(i<n){
            int j = i + 1;   // reset j for every i
            while (j < n) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
                j++;
            }

            i++;
        }
        return false;
    }

    //hashing
    public static int[] twosumrun(int[] arr,int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};

    }

    //greedyapproch
    public static int[] twosumwalk(int[] arr,int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum < target){left++;}
            else if(sum > target){right--;}
            else{
                return new int[] {left,right};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Target Element :");
        int target=sc.nextInt();
        System.out.println();
        System.out.println(twosumgo(arr,target));

        //second approch
        int[] grr=twosumrun(arr,target);
        for(int i=0;i<grr.length;i++){
            System.out.print(grr[i]+" ");
        }

        //greedy approch
        int[] frr=twosumwalk(arr,target);
        for(int i=0;i<frr.length;i++){
            System.out.print(frr[i]+" ");
        }

    }
}
