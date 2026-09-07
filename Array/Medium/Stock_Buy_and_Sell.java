package Medium;

public class Stock_Buy_and_Sell {


    /// ///Buy ones and sell ones
    public static int stocksprofit(int[] arr){
       int min=arr[0];
       int profit=0;
        for(int i=0;i<arr.length;i++){
            int cost=arr[i]-min;
            profit=Math.max(profit, cost);
            min=Math.min(min,arr[i]);

        }
        return profit;
    }


    ///Buy multiple time and sell multiple times
    /// But buy -> sell then again buy->sell
    /// You cannot do something like buy buy buy  and then sell sell sell.
    ///
    ///
    public static int stocksprofit2(int[] arr){
        int min=arr[0];
        int profit=0;
        for(int i=0;i<arr.length;i++){
            int cost=arr[i]-min;
            profit=Math.max(profit, cost);
            min=Math.min(min,arr[i]);

        }
        return profit;
    }



    public static void main(String[] args){
        int[] arr={7, 1 ,5,3,6,4};

        System.out.println(stocksprofit(arr));
    }
}
