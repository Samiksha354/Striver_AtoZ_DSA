//package BS_On_2D;
//
//public class MinNumOfDaysToMakeMBouquets {
//
//
//  //brute force//////////////////////////
//    public int minimum(int[] bloomDay){
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<bloomDay.length;i++){
//            if(bloomDay[i] < min){
//                min=bloomDay[i];
//            }
//        }
//        return min;
//    }
//    public int maximum(int[] bloomDay){
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<bloomDay.length;i++){
//            if(bloomDay[i] > max){
//                max=bloomDay[i];
//            }
//        }
//        return max;
//    }
//
//    public boolean possible(int[] bloomDay, int mid, int m,int k){
//        int count=0;
//        int noOfBookes=0;
//        for(int i=0;i<bloomDay.length;i++){
//            if(bloomDay[i] <= day){
//                count++;
//            }
//            else{
//                noOfBookes=(count/k)+noOfBookes;
//                count=0;
//            }
//        }
//        noOfBookes=(count/k)+noOfBookes;
//        if(noOfBookes >= m) return true;
//        else return false;
//
//
//    }
//    public int minDays(int[] bloomDay, int m, int k) {
//        int n = bloomDay.length;
//        if (n < (m * k)) return -1;
//        int min = minimum(bloomDay);
//        int max = maximum(bloomDay);
//
//        int low = min;
//        int high = max;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            boolean formed = possible(bloomDay, mid, m, k);
//            if (formed == true) return mid;
//
//        }
//
//
//        return -1;
//    }
//
//
// /// //////////////////BINARY SEARCH/////////////////////////////
//    public int minimum(int[] bloomDay){
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<bloomDay.length;i++){
//            if(bloomDay[i] < min){
//                min=bloomDay[i];
//            }
//        }
//        return min;
//    }
//    public int maximum(int[] bloomDay){
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<bloomDay.length;i++){
//            if(bloomDay[i] > max){
//                max=bloomDay[i];
//            }
//        }
//        return max;
//    }
//
//    public boolean possible(int[] bloomDay, int mid, int m,int k){
//        int count=0;
//        int bouquets=0;
//
//        for(int i=0;i<bloomDay.length;i++){
//            if(bloomDay[i] <= mid){
//                count++;
//            }
//            else{
//                bouquets=(count/k)+bouquets;
//                count=0;
//            }
//        }
//        bouquets=(count/k)+bouquets;
//        if(bouquets >= m) return true;
//        else return false;
//
//
//    }
//    public int minDays(int[] bloomDay, int m, int k) {
//        int n=bloomDay.length;
//        long mul=(long)m*(long)k;
//        if( n < mul)  return -1;
//        int min=minimum(bloomDay);
//        int max=maximum(bloomDay);
//
//        int low=min;
//        int high=max;
//        int ans=high;
//
//        while(low <= high){
//            int mid=(low+high)/2;
//
//            if(possible(bloomDay,mid,m,k) == true){
//                ans=mid;
//                high=mid-1;
//            }
//            else{
//                low=mid+1;
//            }
//
//        }
//
//
//        return low;
//    }
//}
