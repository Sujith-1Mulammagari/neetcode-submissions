class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suj=new int[nums.length];
        // with space complexity O(n)
        // HashMap<Integer,Integer> map1=new HashMap<>();
        // HashMap<Integer,Integer> map2=new HashMap<>();
        // map1.put(0,1);
        // map2.put(nums.length-1,1);
        // for(int i=1;i<nums.length;i++){
        //     map1.put(i,map1.get(i-1)*nums[i-1]);
        // }
        // for(int i=nums.length-2;i>=0;i--){
        //     map2.put(i,map2.get(i+1)*nums[i+1]);
        // }
        // // suj[0]=map2.get(1);
        // // suj[-1]=map1.get(nums.length-2);
        // for(int i=0;i<nums.length;i++){
        //     suj[i]=map1.get(i)*map2.get(i);
        // }
        // return suj;



        // lets try with space complexity O(1)
        // suj[0]=1;
        // 1 1 2 8
        // 1 1 2 8
        // 6 12 24 6 24 
        // 1 1 12 8
        // 1   12 8
        //  24 12 8
        // 
        // 1 -1 0 0 0
        // 0 
        // 1 2 8 48
        // 48 24 12 



        
        suj[0]=1;
        for(int i=1;i<nums.length;i++){
            suj[i]=suj[i-1]*nums[i-1];
        }
        int prod=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suj[i]=suj[i]*prod;
            prod*=nums[i];
        }
        return suj;
    }
}  
