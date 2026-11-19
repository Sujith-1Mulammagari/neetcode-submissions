class Solution {
    public boolean isAnagram(String s, String t) {
        int suj[]=new int[26];
        for(int i=0;i<s.length();i++){
            suj[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            suj[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(suj[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
