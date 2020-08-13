public class TwoDimensionFindTarget {
    //1.暴力解
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0){
            return false;
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    //2.从最左下角（或最右上角）开始比较，若比target大，坐标上移，否则右移
    public boolean Find2(int target, int [][] array) {
        if(array==null||array.length==0){
            return false;
        }
        int row=array.length-1,col=array[0].length-1;
        int i=row,j=0;
        while(i>=0&&i<=row&&j>=0&&j<=col){
            if(array[i][j]==target){
                return true;
            }else if(array[i][j]<target){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }
}
