//接雨水暴力解（42）
class Solution {
    public int trap(int[] height) {
        if(height==null||height.length<3){
            return 0;
        }
        int sum=0;
        for(int i=1;i<height.length-1;i++){
            int left_max=0;
            int right_max=0;
            for(int j=i;j>=0;j--){
                left_max=Math.max(left_max,height[j]);
            }
            for(int k=i;k<height.length;k++){
                right_max=Math.max(right_max,height[k]);
            }
            sum+=Math.min(left_max,right_max)-height[i];
        }
        return sum;
    }
}