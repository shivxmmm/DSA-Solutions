class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
        for(int i = 0; i < nums.length; i++){
            heap.add(nums[i]);
        }
        int i = 1;
        while(i < k){
            heap.remove();
            i++;
        }
        return heap.peek();
        
    }
}