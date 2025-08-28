class Solution {
    public int alternateDigitSum(int n) {
        int sign = 1;
        int ans =0;
    String s = String.valueOf(n);
      for( int i = 0; i < s.length(); i++){
        int digit = s.charAt(i) - '0';
        ans += sign * digit;
        sign = -sign;
      }
      return ans;
        
    }
}