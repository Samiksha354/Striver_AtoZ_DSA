package Easy;

public class Second_Largest {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int large=Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > large){
                seclarge=large;
                large=arr[i];
            }
            else if(arr[i] >seclarge && arr[i] != large){
                seclarge=arr[i];
            }
        }
        if(seclarge == Integer.MIN_VALUE){
            return -1;
        }
        return seclarge;
    }
    public static void main(String[] args){
        int[] arr={10, 10,10};
    }
}
