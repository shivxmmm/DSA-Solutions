class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1){
            n = getNext(n);
            if(set.contains(n))
            return false;
            set.add(n);
        }
        return true;
        
    }
    private int getNext(int n){
        int res = 0;
        while( n != 0){
            int d = n % 10;
            res += d * d;
            n /= 10;
        }
        return res;
    }
}