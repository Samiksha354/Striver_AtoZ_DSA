
import java.util.*;



public class HighestOccuringElementInAnArray {
    public static void main(String[] args){
        int[] arr={3, 6,9,11,9,2,9,11,3,6};

        Map<Integer, Integer> hashing=new HashMap<>();

        for(int num:arr){
            hashing.put(num, hashing.getOrDefault(num, 0)+1);
        }


        int max=Integer.MIN_VALUE;

        int resultKey=-1;
        System.out.println("Highest Element Occurences:");
        for(Map.Entry<Integer, Integer> entry:hashing.entrySet()){
            if(entry.getValue() >max){ max=entry.getValue();
                resultKey = entry.getKey(); }
        }

        System.out.println(resultKey);
    }
}
