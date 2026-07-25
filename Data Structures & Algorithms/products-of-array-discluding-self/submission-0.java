class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product=product*nums[j];
                }
            }
            result[i]=product;
            product=1;
        }
        return result;
    }
}  
