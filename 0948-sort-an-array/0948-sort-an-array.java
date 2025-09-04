class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer> minheap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            minheap.offer(nums[i]);
        }
        int i = 0;
        while(!minheap.isEmpty()){
            nums[i] = minheap.poll();
            i++;
        }
        return nums;
    }
}