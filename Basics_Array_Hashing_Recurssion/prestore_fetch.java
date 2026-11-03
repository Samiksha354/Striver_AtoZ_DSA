import java.util.*;
import java.util.HashSet;

public class prestore_fetch {
    public static void main(String args[]){
        int[] arr={3, 6,9,11,9,2,9,11,3,6};


        //calculating the max number
        int max=0;
        for(int num:arr){
            if(num >max) max=num;
        }

        //setting the array size which contain all zeros
        int[] count=new int[max+1];

        //traversing the array of zeros and incrementing the zeros based on indexes
        for(int num:arr){
            count[num]++;
        }

        // Print the results

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("Number " + i + " appears " + count[i] + " times.");
            }
        }


















//         //Craeting a hashmap
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//        //traverse array and update frequencies
//        for(int num:arr){
//            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
//        }
//
//        //printthe result
//        System.out.println("Element Occurences:");
//        for(Map.Entry<Integer, Integer> entry :frequencyMap.entrySet()){
//            System.out.println("number"+entry.getKey()+"appears"+entry.getValue()+"times.");
//        }

    }

}
