package BS_On_2D;

public class allocationOfBooks {
    static boolean addition1(int[] arr,int mid ,int stuno){
        int addition=0;
        int stu=1;
        for(int i=0;i<arr.length;i++){

            if(addition+ arr[i] <= mid){
                addition=addition+arr[i];
            }else{
                stu=stu+1;
                addition=arr[i];
            }
        }
        if(stu > stuno) return false;

        return true;
    }
    static int booksAllotment(int[] arr, int student){
        int sum=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(arr[i]<mini) mini=arr[i];
        }
        int low=mini;
        int high=sum;
        int result=0;


        while(low <= high){
              int mid=(low+high)/2;

              if(addition1(arr,mid,student) == true){
                  result=mid;
                  high=mid-1;
              }else{
                  low=mid+1;
            }
        }

        return result;
    }
    public static void main(String[] args){
        int[] arr={25, 46, 28, 49,24};
        int student=4;


        int result=booksAllotment(arr, student);
        System.out.print(result);

    }
}
