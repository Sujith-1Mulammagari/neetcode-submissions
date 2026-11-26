class Solution {
    public boolean check(int[] suj1,int[] suj2)
    {
        for(int i=0;i<58;i++)
        {
            if(suj2[i]!=0)
            {
                if(suj2[i]>suj1[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        int[] suj1=new int[58];
        int suj2[]=new int[58];
        int i=0,j=0;
        String result="";
        for(int a=0;a<t.length();a++)
        {
            // suj1[s.charAt(a)-'A']++;
            suj2[t.charAt(a)-'A']++;
        }
        // if(check(suj1,suj2)){
        //     return s;
        // }
        while( j<s.length()){
            suj1[s.charAt(j)-'A']++;
            
                while(check(suj1,suj2)){
                    if(result.length()==0){
                        result=s.substring(i,j+1);
                    }
                    else{
                        if(j-i+1<result.length())
                        {
                            result=s.substring(i,j+1);
                        }
                    }
                    suj1[s.charAt(i)-'A']--;
                    i++;
                }
             
            j++;
        }
        return result;
    }
}
