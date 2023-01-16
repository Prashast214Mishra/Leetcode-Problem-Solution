class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
       
        for(int i=0; i<nums.length; i++){
            int ab = target - nums[i];
            if(map.containsKey(ab)){
                return new int []{map.get(ab), i};
            }
            map.put(nums[i], i);
        }return new int[]{-1,-1};
    }
}
