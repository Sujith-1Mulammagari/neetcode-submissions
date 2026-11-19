class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> suj=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            if(suj.containsKey(target-nums[i])){
                ans[0]=suj.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }
            else{
                suj.put(nums[i],i);
            }
        }
        return ans;
    }
}
