class Solution {
    public int maximumCount(int[] nums) {
        int a=0;
        int i=0;
        while(i<nums.length && nums[i]<=0){
            if(nums[i]<0){
                a=a+1;
            }
            i++;
        }
        return Math.max (nums.length-i,a);
       
        
    }
}
