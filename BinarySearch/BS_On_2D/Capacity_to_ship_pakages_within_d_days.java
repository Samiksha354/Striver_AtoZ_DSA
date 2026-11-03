//package BS_On_2D;
//
//public class Capacity_to_ship_pakages_within_d_days {
//    public int maximum(int[] arr){
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
//
//    public int Summm(int[] weights){
//        int sum=0;
//        for(int i=0;i<weights.length;i++){
//            sum=sum+weights[i];
//        }
//
//        return sum;
//    }
//
//
//    public int requiredDays(int[]weights, int capacity){
//        int days=1;
//        int load=0;
//
//        for(int k=0;k<weights.length;k++){
//            if(load+weights[k] > capacity){
//                days=days+1;
//                load=weights[k];
//            }
//            else{
//                load=load+weights[k];
//            }
//
//        }
//
//        return days;
//    }
//
//
//
//
//    public int shipWithinDays(int[] weights, int days) {
//        int n=weights.length;
//        int max=maximum(weights);
//        int arraySum=Summm(weights);
//
//        for(int capacity=max;capacity<= arraySum;capacity++){
//            int daysReq=requiredDays(weights, capacity);
//
//            if(daysReq <= days) return capacity;
//
//
//        }
//        return -1;
//
//    }
//
//
//    /// ////// Binary Search
//
//    public int maximum(int[] arr){
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
//
//    public int Summm(int[] weights){
//        int sum=0;
//        for(int i=0;i<weights.length;i++){
//            sum=sum+weights[i];
//        }
//
//        return sum;
//    }
//
//
//    public int requiredDays(int[]weights, int capacity){
//        int days=1;
//        int load=0;
//
//        for(int k=0;k<weights.length;k++){
//            if(load+weights[k] > capacity){
//                days=days+1;
//                load=weights[k];
//            }
//            else{
//                load=load+weights[k];
//            }
//
//        }
//
//        return days;
//    }
//
//
//
//
//    public int shipWithinDays(int[] weights, int days) {
//        int n=weights.length;
//        int low=maximum(weights);
//        int high=Summm(weights);
//        int ans=Integer.MAX_VALUE;
//
//        while(low <= high){
//            int mid=(low+high)/2;
//
//            int reqDays=requiredDays(weights, mid);
//
//            if(reqDays <= days){
//                if(ans > mid) ans=mid;
//                high=mid-1;
//            }
//            else{low=mid+1;}
//
//        }
//
//
//
//        return ans;
//
//    }
//
//
//
//
//}
