class Solution {
    public int lengthOfLongestSubstring(String s) {
        // String suj="";
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        // return suj.length();
        int i=0,j=1,count=1;
        int result=1;
        HashSet<Character> suj=new HashSet<>();
        suj.add(s.charAt(i));
        while(j<s.length() && i<s.length())
        {
            if(!suj.contains(s.charAt(j)))
            {
                suj.add(s.charAt(j));
                // count++;
                j++;
                result=Math.max(result,j-i);
                // j++;
                // suj.add(s.charAt(j))
            }
            else{
                suj.remove(s.charAt(i));
                i++;
                // result--;
            }
        }
        return result;
    }
}
