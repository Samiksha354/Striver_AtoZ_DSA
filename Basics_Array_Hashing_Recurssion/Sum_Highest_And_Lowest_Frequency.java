import java.util.*;

public class Sum_Highest_And_Lowest_Frequency {
   public static void main(String[] args){
       int[] arr={3, 6,9,11,9,2,9,11,3,6};

       Map<Integer, Integer> hashing=new HashMap<>();

       for(int num: arr){
           hashing.put(num,hashing.getOrDefault(num,0)+1);
       }

       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       int high=-1;
       int low=-1;

       for(Map.Entry<Integer, Integer> num: hashing.entrySet()){
           if(num.getValue() < min) min=num.getValue();
           if(num.getValue() > max) max=num.getValue();
       }

       System.out.println(min+max);
    }
}
