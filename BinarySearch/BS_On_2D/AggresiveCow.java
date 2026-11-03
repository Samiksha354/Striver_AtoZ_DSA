package BS_On_2D;

public class AggresiveCow {

    public static int maxofarr(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }

//    public static boolean funarrgressivecow(int[] arr, int dist,int cows){
//        int n=arr.length;
//        int ans=0;
//        int numcows=1;
//        int last = arr[0];
//            for(int j=0;j<n;j++){
//                if((arr[j] -last) >= dist ){
//                    numcows=numcows+1;
//                    last=arr[j];
//                }
//            }
//            if( numcows >= cows) {
//                return true;
//                }
//
//
//        return  false;
//    }
//
//    public static int aggresivecow(int[] arr, int cows){
//       int nn=arr.length;
//       int maxarr=maxofarr(arr);
//       for(int j=1;j<=maxarr;j++){
//               if(funarrgressivecow(arr,j,cows) == true){
//                   continue;
//               }
//               else{
//                   return (j-1);
//               }
//           }
//
//        return -1;
//    }




/// //////////////////// Binary Serach
///
public static boolean funarrgressivecow(int[] arr, int mid,int cows){
    int n=arr.length;
    int numcows=1;
    int last = arr[0];
    for(int j=0;j<n;j++){
        if((arr[j] -last) >= mid ){
            numcows=numcows+1;
            last=arr[j];
        }
    }
    if( numcows >= cows) {
        return true;
    }


    return  false;
}



    public static int aggresivecow2(int[] arr, int cows){
        int n=arr.length;
        int low=1;
        int high=arr[n-1]-arr[0];
        int ans=0;
        while(low <= high){
            int mid=(low+high)/2;
            if(funarrgressivecow( arr, mid,cows) == true){
             ans=mid;
             low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return ans;
    }
    public static void main (String [] args){
        int[] arr={1, 5,10};
        int numberofcows=2;

        int maxofmin=aggresivecow2(arr, numberofcows);
        System.out.print(maxofmin);


    }
}
