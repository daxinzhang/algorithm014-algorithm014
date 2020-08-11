import java.util.*;

//三数之和
//1.暴力解
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if(nums==null){
            return list;
        }
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list1=new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        Collections.sort(list1);
                        list.add(list1);
                    }
                }
            }
        }
        HashSet<List<Integer>> hash=new HashSet<>(list);
        List<List<Integer>> list1=new ArrayList<>(hash);
        return list1;
    }
}
//****************************************************************
//2.双指针法
class ThreeSum1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if(nums==null){
            return list;
        }
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0) break;
            if(i>0&&nums[i]==nums[i-1]) continue;
            int m=i+1,n=nums.length-1;
            while(m<n) {
                sum = nums[i] + nums[n] + nums[m];
                if (sum > 0) {
                    while (m < n && nums[n] == nums[--n]) ;
                } else if (sum < 0) {
                    while (m < n && nums[m] == nums[++m]) ;
                } else {
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[m], nums[n])));
                    while (m < n && nums[n] == nums[--n]) ;
                    while (m < n && nums[m] == nums[++m]) ;
                }
            }
        }
        return list;
    }
}
