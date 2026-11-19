class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> suj=new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            if(suj.contains(nums[i])){
                return true;
            }
            else{
                suj.add(nums[i]);
            }
        }
        return false;
    }
}