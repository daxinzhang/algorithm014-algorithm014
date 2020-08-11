//盛水最多的容器
//********************************************************************
//1.暴力解
/*public class MaxArea {
    public int maxArea(int[] height) {
        if(height==null){
            return 0;
        }
        int max=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                max=Math.max(max,(j-i)*Math.min(height[i],height[j]));
            }
        }
        return max;
    }
}*/
//*********************************************************************
//2.双指针法，从两端逐步逼近
class MaxArea {
    public int maxArea(int[] height) {
        if(height==null){
            return 0;
        }
        int max=0;
        for(int i=0,j=height.length-1;i<j;){
            int h=height[i]<height[j]?height[i++]:height[j--];
            max=Math.max(max,(j-i+1)*h);
        }
        return max;
    }
}
