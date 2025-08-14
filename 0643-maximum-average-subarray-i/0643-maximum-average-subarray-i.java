class Solution {
    public double findMaxAverage(int[] nums, int k) {
    // Calculate the sum of the first window
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        
        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // remove left element, add right element
            maxSum = Math.max(maxSum, sum);
        }
        
        // Return maximum average
        return maxSum / k;
    }
}
