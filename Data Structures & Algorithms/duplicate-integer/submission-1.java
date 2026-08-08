class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> isduplic = new HashSet<>();
      for (int i = 0;i < nums.length;i++){
        if (isduplic.contains(nums[i])){
          return true;
        }
        isduplic.add(nums[i]);
      }
        
      return false; 
    }
}