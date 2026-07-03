class Solution {
    public int[] twoSum(int[] nums, int target) {


        if(nums.length >= 2 && nums.length <= 1000){
            
            for(int i = 0 ; i < nums.length; i++){
                for(int j = i + 1 ; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            
            System.out.println(Arrays.toString(nums));
            System.out.println(List.of(nums).contains(1));

        }


        return null;
    }
}
