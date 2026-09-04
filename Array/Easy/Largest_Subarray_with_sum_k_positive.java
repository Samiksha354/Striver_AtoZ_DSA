package Easy;

public class Largest_Subarray_with_sum_k_positive {
    static int longestsubarray(int[] arr,int m){
        int len=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum =sum+arr[k];
                }
                if(sum == m) {
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }

    /// //////Better
    static int longestsubarray2(int[] arr,int m){
        int len=0;
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == m) {
                    len = Math.max(len, j - i + 1);

                }
            }
        }

     return len;
    }



    /// hashmap = the hashmap approach is better if all positive
    /// it is optimal approch for (positive and negative numbers)
    static int longestsubarray3(int[] arr,int m){
        return -1;
    }

/// two pointer approach
    static int longestsubarray4(int[] arr,int m){
        int i=0;
        int j=i;
        int len=0;
        while(j <arr.length){
            int sum=0;
            sum=arr[i]+sum;
            if(sum > m){
                len=Math.max(len, j-i+1);
            }
            i++;
            j++;
        }
        return len;
    }




    public static void main(String [] args){
        int[] arr={1 ,2,3,1,1,1,1,4,2,3};
        int k=3;//sum that we want
//        int ans=longestsubarray(arr,k);
//        System.out.println(ans);

        int ans4=longestsubarray4(arr,k);
        System.out.println(ans4);

    }
}
