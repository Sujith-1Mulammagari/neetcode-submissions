class Solution {
    public int longestConsecutive(int[] nums) {
        
        // ------- MY IDEA BUT DIDNT WORK FOR ALL ------

        // HashSet<Integer> suj=new HashSet<>();
        // int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        // for(int i:nums){
        //     suj.add(i);
        //     min=Math.min(min,i);
        //     max=Math.max(max,i);
        // }
        // int count=0,temp=0;
        // for(int i=min;i<max+1;i++){
        //     if(suj.contains(i)){
        //         temp++;
        //         count=Math.max(count,temp);
        //     }
        //     else{
        //         temp=0;
        //     }
        //     // count=Math.max(count,temp);

        // }
        // return count;
        // // return max;


        // --------- AFTER LEARNING FROM CHATGPT ----------
        
        HashSet<Integer> suj=new HashSet<>();
        int count=0;
        for(int i:nums){
            suj.add(i);
        }
        int temp=0;
        for(int i:suj){
            if(!suj.contains(i-1)){
                while(suj.contains(i)){
                    temp++;
                    count=Math.max(count,temp);
                    i++;
                }
                temp=0;
            }
        }
        return count;



    }
}
