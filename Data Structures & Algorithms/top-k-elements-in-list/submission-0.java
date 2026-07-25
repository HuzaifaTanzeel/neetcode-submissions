class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<HashMap.Entry<Integer,Integer>> heap = 
        new PriorityQueue<>(
            (a,b)->a.getValue()-b.getValue()
        );

        for(HashMap.Entry<Integer, Integer> entry: freq.entrySet()){
            heap.offer(entry);

            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] result = new int[k];

        for(int i=k-1;i>=0;i--){
            result[i]=heap.poll().getKey();
        }

        return result;


    }
}
