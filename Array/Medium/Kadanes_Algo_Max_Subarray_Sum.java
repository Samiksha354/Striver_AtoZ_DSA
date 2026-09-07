package Medium;

import static java.util.Collections.max;

public class Kadanes_Algo_Max_Subarray_Sum {

    /// Brut force
    static int maxsubarray(int[] arr){
        int len=0;
        for(int i=0;i<arr.length;i++){
           for (int j=i;j<arr.length;j++){
               int sum=0;
               for(int k=i;k<=j;k++){
                   sum =arr[k]+sum;
               }
               len=Math.max(len,sum);
           }
        }
        return len;
    }



    /// Brut force
    static int maxsubarray2(int[] arr){
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for (int j=i;j<arr.length;j++){
                sum =arr[j]+sum;

                maxlen=Math.max(maxlen,sum);


            }
        }
        return maxlen;
    }



    /// ////////Kadanes Algoritham
    static int maxsubarray3(int[] arr){
        int  maxlen=Integer.MIN_VALUE;
        int sum=0;

        // this to keep track of that array
        int ansstart=-1;
        int ansend=-1;


        int start=0;
        for(int i=0;i<arr.length;i++){
            if(sum ==0) start=i;
          sum=sum+arr[i];
          if(sum > maxlen){
              maxlen =sum;
               ansstart=start;
               ansend=i;
          }
          if(sum <0) sum =0;


        }

        for(int k=ansstart;k <=ansend; k++){
            System.out.print("   "+arr[k]);
        }
        return maxlen;
    }



    public static void main(String [] args){
        int[] arr={-2, -3, 4, -1,-2 ,1 ,5,-3};

        int ans=maxsubarray(arr);
        System.out.println("3Approach"+ans);

        int ans1=maxsubarray2(arr);
        System.out.println("2Approach"+ans1);

        int ans2=maxsubarray3(arr);
        System.out.println("      "+"3Approach"+ans2);

    }
}
