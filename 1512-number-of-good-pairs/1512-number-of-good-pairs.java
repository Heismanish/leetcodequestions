class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pair = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j ){
                    continue;
                }
                
                if(nums[i] == nums[j] && j > i){
                   pair ++;
                
                }
            }
        }
        return pair;
    }
}