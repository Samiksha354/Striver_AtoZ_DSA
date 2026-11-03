package BS_On_2D;

public class FindTheSmallestDivisorGivenAThreshold {


    /// //////////////BRUTE FORCE/////////////
    public int maximum(int[] nums){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max=nums[i];
            }
        }
        return max;
    }


    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=maximum(nums);

        for(int i=1;i<=max;i++){
            double sum=0.0;
            for(int k=0;k < nums.length;k++){
                sum=sum+Math.ceil((double)nums[k]/i);
            }
            if(sum <= threshold) return i;

        }

        return -1;
    }



    /// ////////////////////BINARY SEARCH///////////////////////


}
