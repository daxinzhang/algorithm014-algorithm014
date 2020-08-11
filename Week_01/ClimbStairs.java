//爬楼梯问题，斐波拉契数列
//*****************************************************************
//1.递归，时间超时
/*public class ClimbStairs {
    public int climbStairs(int n) {
            if(n==1) return 1;
            if(n==2) return 2;
            return climbStairs(n-1)+climbStairs(n-2);
    }
}*/
//缓存解
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int i=1,j=2,k=3;
        for(int m=3;m<=n;m++){
            k=i+j;
            i=j;
            j=k;
        }
        return k;
    }
}
