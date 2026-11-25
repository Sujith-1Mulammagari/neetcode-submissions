class Solution {
    public int characterReplacement(String s, int k) {
        int[] suj=new int[26];
        int left=0,right=0,freq=0,result=0;
        while(right<s.length())
        {
            char ch=s.charAt(right);
            suj[ch-'A']++;
            freq=Math.max(freq,suj[ch-'A']);
            while((right-left+1)-freq>k){
                suj[s.charAt(left)-'A']--;
                left++;
            }
            result=Math.max(result,(right-left+1));
            right++;
        }
        return result;
        // while(right<s.length())
        // {
        //     if((right-left+1)-freq<=k)
        //     {
        //         suj[s.charAt(right)-'A']++;
        //         freq=Math.max(freq,suj[s.charAt(right)-'A']);
        //         // right++;
        //         result=Math.max(result,right-left+1);
        //         right++;
        //     }
        //     else{
        //         while((right-left+1)-freq<=k)
        //     }
        // }
        // return result;
        // while(right<s.length())
        // {
        //     // char ch=s.charAt(right);
        //     // // right++;
        //     // suj[ch-'A']++;
        //     // freq=Math.max(freq,suj[ch-'A']);
        //     if((right-left+1)-freq<=k)
        //     {
        //         char ch=s.charAt(right);
        //         // right++;
        //         suj[ch-'A']++;
        //         freq=Math.max(freq,suj[ch-'A']);
        //         right++;
        //         result++;
        //     }
        //     else{
        //         char ch =s.charAt(i);
        //         suj[ch-'A']--;
        //         freq=Math.max()
        //     }
        // }
        // return result;
        // at 0 freq 1
    }
}
