package algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] A = {9,8,7,6,5,4,3,1,-4,-2};
        System.out.println(threeSum(A));
    }

    private static List<List<Integer>> threeSum(int[] A) {
  
        //sort the array
        Arrays.sort(A);
        //create a map to store value and its complement pair
        Set<List<Integer>> threeSumSet = new HashSet<>();
        for(int i =0; i<A.length-2;i++){
            //Find two sum 
          findTwoSum(A, i, threeSumSet);
        }
        
        return new ArrayList(threeSumSet);
  }

  /**
   * Find the complement of integer at rootIndex and search the rest of the array 
   * to find two numbers with sum as complement.
   * @param A
   * @param rootIndex
   * @param set
   */
  private static void findTwoSum(int[] A, int rootIndex, Set<List<Integer>> set){
    int value = A[rootIndex];
    int complement = 0 - value;
    int j=rootIndex+1;
    int k=A.length-1;
    while(j < k){
      int sum = A[j] + A[k];
      if(sum == complement){
        set.add(Arrays.asList(value, A[j++], A[k--]));
      }
      if(sum<complement){
          j++;
      }
      if(sum>complement){
          k--;
      }
      
    }
  }
}
