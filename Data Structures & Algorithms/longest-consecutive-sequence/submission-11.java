class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;
       
       Arrays.sort(nums);
       int re = 0,curr = nums[0],streak = 0,i = 0;
       while (i < nums.length){
        if (curr != nums[i]){
            curr = nums[i];
            streak = 0;
        }
        while (i < nums.length && nums[i] == curr){
            i++;
        }




        curr++;
        streak++;
        re = Math.max(re,streak);
       }
        return re;
    }
}
