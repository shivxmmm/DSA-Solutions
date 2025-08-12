class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0; i<=nums.length-1;i++){
            sum=sum+nums[i];
        }
        int n=nums.length+1;
        int as=n*(n-1)/2;
        return as-sum;
    }
}