class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ansarray = new int[2*n];
        for(int i = 0, j = n, index = 0; index < ansarray.length; i++, j++){
            ansarray [index] = nums[i];
            index++;
            ansarray [index] = nums[j];
            index++;   
        }
        return ansarray;
    }
}