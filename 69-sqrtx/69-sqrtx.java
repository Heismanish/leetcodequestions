class Solution {
     long binarySearch(int n ){
        
        long start = 0;
        long end = n;
        long ans = -1;
        
        while(start <= end){
            long mid = start + (end - start) / 2;
            
            long square = mid * mid;
            
            if(square == n)
                return mid;
            else if(square < n){
                ans = mid;
                start = mid + 1;
            }
            else
                end = mid - 1;
                
        }
        return ans;
    }
    
    public int mySqrt(int x) {
         return (int)binarySearch(x);
    
    }
}