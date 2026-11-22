class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] suj=new int[2];
        int i=0,j=num.length-1;
        while(i<j){
            int sum=num[i]+num[j];
            if(sum==target){
                suj[0]=i+1;
                suj[1]=j+1;
                return suj;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return suj;
    }
}
