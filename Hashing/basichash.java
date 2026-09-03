public class basichash {

    //count how many time does a number appears
    static int[] count(int number ,int[] arr){
        int n=arr.length;
        int countele=0;
        for(int i=0;i<n;i++){
            countele=0;
           for(int j=i+1;j<n;j++) {
               if (arr[j] == number) {
                   countele++;

               }
               else{
                   countele=1;
               }
           }
            return new int[]{number, countele};

        }

        return new int[] {-1, -1};
    }
    public static void main(String[] args){
int number=1;
        int[] arr={1, 7,3,6,90,2,6,7,90,90};
         int n=arr.length;
        int[] brr=count(number,arr);

        for(int i=0;i<brr.length;i++){
            System.out.print("  "+brr[i]);
        }

    }
}
