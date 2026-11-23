class Solution {
    public int trap(int[] height) {
        // 0 2 0 3 1 0 1 3 2 1
        // 0 2 2 3 3 3 3 3 3 3
        // 3 3 3 3 3 3 3 3 2 1
        // 0 0 2 0 2 3 2 0 0 0
        // 0 2 2 2 3 3 3  3 3 3
        // 3 3 3 3 3 3 3  3 1 1
        // 0 0 2 0 2 3 2  0 0 0
        // 0 0 2 0 2 3 2 3 0 0 0
        // 0 0 2 0 2 3 2 3 0 0 0
        int[] l=new int[height.length];
        int[] r=new int[height.length];
        l[0]=height[0];
        r[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            l[i]=Math.max(l[i-1],height[i-1]);
        }
        // 0 0 2 2 3 3 3 3 3 3
        // 3 3 3 3 3 3 3 2 1 1
        // 0 0 2 
        for(int i=height.length-2;i>=0;i--){
            r[i]=Math.max(r[i+1],height[i+1]);
        }
        int result=0;
        for(int i=1;i<height.length;i++){
            // result+=Math.min(l[i],r[i])-height[i];
            if(Math.min(l[i],r[i])-height[i]>0){
                result+=Math.min(l[i],r[i])-height[i];
            }
        }
        return result;
    }
}
