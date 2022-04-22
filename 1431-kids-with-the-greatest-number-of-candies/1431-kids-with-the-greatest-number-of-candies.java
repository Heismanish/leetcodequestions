class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        for (int i = 0 ; i < candies.length; i++ ){
            boolean ans = true;
            //int a = candies[i] + extraCandies; 
            for (int j = 0 ; j < candies.length; j++){
                //int sum = candies[j];
                if(candies[i] + extraCandies < candies[j]){
                    ans = false;
                    break;
                } else {
                    ans  = true;
                }

            }
            result.add(ans); 
        }
        return result;
    }
}