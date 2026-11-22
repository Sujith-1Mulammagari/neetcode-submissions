class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> suj1=new ArrayList<>();
        HashSet<List<Integer>> suj=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            // -4 -1 -1 0 1 2
            int val=-nums[i],a=i+1,b=nums.length-1;
            while(a<b)
            {
                if(nums[a]+nums[b]==val)
                {
                    suj.add(new ArrayList<>(Arrays.asList(nums[i],nums[a],nums[b])));
                    a++;
                    b--;
                }
                else if(nums[a]+nums[b]<val){
                    a++;
                }
                else{
                    b--;
                }
            }
        }
        for(List i:suj){
            suj1.add(i);
        }
        return suj1;
    }
}
