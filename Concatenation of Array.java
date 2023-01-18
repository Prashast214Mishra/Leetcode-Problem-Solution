class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] add= new int [2*nums.length];
        for(int i=0; i<nums.length; i++){
            add[i]=nums[i];
             }
        int j=0;

        for(int i= nums.length; i<add.length; i++){
           add[i]=nums[j];
            j++;
            }
              return add;
    }
}
