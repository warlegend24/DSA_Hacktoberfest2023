class Solution {
    public int trap(int[] height) {
        //most optimised approach 
        //2 pointer approach
        int n = height.length; 
        int l=0;
        int r=n-1;
        int leftMax = 0;
        int rightMax= 0;
        int water = 0;
        while(l<=r){
            //main 2 possibilites 
            if(height[l]<=height[r]){
                //further 2 possibilities
                if(height[l]>leftMax){
                    leftMax=height[l];
                }
                else{
                    water += (leftMax - height[l]); 
                }
                l++;
            }
            else{
                //height[l]>height[r]..
                //further have  possibilities..
                if(height[r]>rightMax){
                    rightMax = height[r];
                }
                else{
                    water += (rightMax-height[r]) ;
                }

                r--;
            }
        }

        return water;


    }
}
