class Solution {

    public String encode(List<String> strs) {
        // String suj="";
        // for(String s:strs){
        //     suj=suj+s+'#';
        // }
        // return suj;
        StringBuilder suj=new StringBuilder();
        for(String s:strs){
            suj.append(s.length()).append('#').append(s);
        }
        return suj.toString();
    }

    public List<String> decode(String str) {
        List<String> s=new ArrayList<>();
        // String ans="";
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='#')
        //     {
        //         s.add(ans);
        //         ans="";
        //         continue;
        //     }
        //     ans=ans+str.charAt(i);
        // }
        // return s;
        // s.add(str);
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            // 5#hello10#java#world
            s.add(str.substring(j+1,j+1+len));
            i=j+1+len;
        }
        return s;
    }
}
