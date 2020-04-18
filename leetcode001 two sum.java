class Solution {
    public int[] twoSum(int[] nums, int target) {
            if(nums.length == 0){
                return null;
            }
            int[] ret = new int[2];
            Map<Integer, Integer> mymap = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                if(mymap.containsKey(nums[i])){
                    ret[0] = mymap.get(nums[i]);
                    ret[1] = i;
                    return ret;
                }
                mymap.put(target - nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
    }
}