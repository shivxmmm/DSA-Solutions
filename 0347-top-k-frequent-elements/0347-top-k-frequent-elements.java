class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Queue<Map.Entry<Integer, Integer>> minheap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            minheap.offer(entry);
            if(minheap.size() > k){
                minheap.poll();
            }
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = minheap.poll().getKey();

        }
        return ans;
    }
}