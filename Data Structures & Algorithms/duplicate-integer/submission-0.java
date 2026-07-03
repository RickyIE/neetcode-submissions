class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 100000){
            for (int i =0 ; i < nums.length; i++){
                for(int j = i + 1 ; j < nums.length; j++){
                    if(nums[i] >= -1000000000 && nums[i] <+ 1000000000){
                        if (nums[i] == nums[j]){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}