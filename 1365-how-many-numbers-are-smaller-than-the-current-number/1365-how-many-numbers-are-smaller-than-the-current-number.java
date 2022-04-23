class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int [nums.length];
        int n = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++ ){
                if( i == j ){continue;}
                if( nums[i] > nums[j] ){
                    n++;
                }
            }
            ans[i] = n;
            n = 0;
        }
        return ans;
    }
}