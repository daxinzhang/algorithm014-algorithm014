//滑动窗口暴力解（239）
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0||k==0){
            return new int[0];
        }
        int[] result=new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            result[i]=max;
        }
        return result;
    }
}