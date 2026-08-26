class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;
        int jump = 0;
        int end = 0;
        int farthest = 0;

        for(int i = 0; i < n -1; i++){

            farthest = Math.max(farthest, nums[i] + i);

            if(farthest >= n - 1){
                jump++;
                return jump;
            }

            if(i == end){
                jump++;
                end = farthest;
            }
        }
        return jump;
    }
}