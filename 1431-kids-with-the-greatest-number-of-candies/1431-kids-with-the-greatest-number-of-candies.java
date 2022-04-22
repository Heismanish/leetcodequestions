class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        int max = 0; 
        for(int i: candies){
            if(max < i){
                max = i;
            }
        }
       /* for (int i = 0 ; i < candies.length; i++ ){
            boolean ans = true;
            int a = candies[i] + extraCandies; 
            for (int j = 0 ; j < candies.length; j++){
                int sum = candies[j];
                if(a < sum){
                    ans = false;
                    break;
                } else {
                    ans  = true;
                }

            }
            result.add(ans); 
        }*/
        for( int i = 0; i< candies.length; i++){
            if(candies[i] + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
        
     }
}