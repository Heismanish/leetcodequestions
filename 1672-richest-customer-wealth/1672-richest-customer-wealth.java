class Solution {
    public int maximumWealth(int[][] accounts) {
        int  i = 0;
        int max = Integer.MIN_VALUE;
        while(i < accounts.length){
            int sum = 0;
            for ( int j = 0; j < accounts[i].length; j++){
            sum += accounts[i][j];
            }
            i++;
            max = Math.max(sum,max);
        }
        return max;
    }
}