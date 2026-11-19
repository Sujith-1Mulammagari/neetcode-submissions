class Solution {
    public String anag(String s){
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-97]++;
        }
        String ans="";
        for(int i:arr){
            ans=ans+i+'#';
        }
        return ans;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> suj=new ArrayList<>();
        String arrr[]=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            arrr[i]=anag(strs[i]);
        }
        HashMap<String,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<arrr.length;i++){
            if(map.containsKey(arrr[i])){
                int index=map.get(arrr[i]);
                List<String> fun=suj.get(index);
                fun.add(strs[i]);
                // suj.remove(j);
                // suj.add(fun);    
                suj.set(index,fun);
            }
            else{
                List<String> new1=new ArrayList<>();
                map.put(arrr[i],j);
                new1.add(strs[i]);
                suj.add(new1);
                j++;
            }
        }
        return suj;
    }
}
