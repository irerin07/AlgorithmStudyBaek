package leetcodetop100;

import java.util.HashMap;

public class leetcode136 {
  class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer, Integer> hm = new HashMap<>();

      for(int i : nums){
        hm.put(i, hm.getOrDefault(i, 0) + 1);
      }
      for(int i: nums) {
        if(hm.get(i) == 1){
          return i;
        }
      }
      return 0;
    }
  }

  class SolutionBitWise {
    public int singleNumber(int[] nums) {
      int a = 0;
      for (int i : nums) {
        a ^= i;
      }
      return a;
    }
  }

}
