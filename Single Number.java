class Solution {
    public int singleNumber(int[] num) {
        int a=0;
        for(int i=0; i< num.length;i++){
            a= a^num[i];
            }
            return a;

    }
}
