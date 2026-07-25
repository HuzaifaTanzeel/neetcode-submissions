class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> mapp= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(mapp.containsKey(nums[i])){
                return true;
            }
            else{
                mapp.put(nums[i],1);
            }
        }
        return false;
    }
}