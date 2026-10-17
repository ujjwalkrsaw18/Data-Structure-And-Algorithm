class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1){
            return nums;
        }
        Map<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxHeap.addAll(map.keySet());
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=maxHeap.poll();
        }
        return ans;
        

    }
}
