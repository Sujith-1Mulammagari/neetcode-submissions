class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] suj=new ArrayList[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         if(map.get(nums[i])>=k){
        //             suj.add(map.get(nums[i]));
        //         }
        //     }
        // }
        // for(int key:map.keySet()){
        //     if(map.get(key)>=k){
        //         suj.add(key);
        //     }
        // }
        for(int key:map.keySet()){
            int count=map.get(key);
            if(suj[count]==null){
                suj[count]=new ArrayList<Integer>();
            }
            suj[count].add(key);
        }
        int[] ans=new int[k];
        int j=0;
        for(int i=nums.length;i>0;i--){
            if(suj[i]!=null){
                // ans[j]=suj.get(i)
                // j++;
                for(int num:suj[i]){
                    ans[j]=num;
                    j++;
                    if(j==k){
                        break;
                    }
                }
            }
            if(j==k){
                break;
            }
        }
        return ans;

        // int ans[]=suj.toArray(new Integer[0]);
        // return Arrays.toString(ans);
        // return suj.toArray();
        // return suj.stream().mapToInt(Integer::intValue).toArray();
    }
}
