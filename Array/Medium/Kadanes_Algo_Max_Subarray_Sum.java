package Medium;

import static java.util.Collections.max;

public class Kadanes_Algo_Max_Subarray_Sum {

    /// Brut force
    static int maxsubarray(int[] arr,int m){
        int len=0;
        for(int i=0;i<arr.length;i++){
           for (int j=i;j<arr.length;j++){
               int sum = 0;
               for(int k=i;k<=j;k++){
                  sum =arr[k]+sum;
                  if(sum == m) {
                      len=Math.max(len,j-i+1);
                  }
               }
           }
        }
        return len;
    }
    public static void main(String [] args){
        int[] arr={1 ,2,3,1,1,1,1,4,2,3};
        int k=3;//sum that we want
        int ans=maxsubarray(arr,k);
        System.out.println(ans);

    }
}
