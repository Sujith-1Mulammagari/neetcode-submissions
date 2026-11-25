class Solution {
    public boolean check(int[] suj1,int[] suj2)
    {
        for(int i=0;i<26;i++)
        {
            if(suj1[i]!=suj2[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int[] suj1=new int[26];
        int[] suj2=new int[26];
        for(int i=0;i<s1.length();i++){
            suj1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            suj2[s2.charAt(i)-'a']++;
        }
        int j=s1.length(),i=0;
        if(check(suj1,suj2)){
            return true;
        }
        while(j<s2.length())
        {
            if(!check(suj1,suj2))
            {
                suj2[s2.charAt(i)-'a']--;
                suj2[s2.charAt(j)-'a']++;
                i++;
                j++;
                if(check(suj1,suj2)){
                    return true;
                }
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}
