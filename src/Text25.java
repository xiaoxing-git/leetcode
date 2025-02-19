import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Text25 {
    public static void main(String[] args) {
        int[] nums ={-1,0,1,2,-1,-4};
        new Text25().threeSum(nums);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        int n=nums.length-1;
        //升序排序
        Arrays.sort(nums);
        //遍历所有数，取第一个数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                break;
            }
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int p1=i+1;
            int p2=n;
                while (p1 < p2) {
                    if (nums[i] + nums[p1] + nums[p2] > 0) {
                        p2--;
                        continue;
                    }
                    if (nums[i] + nums[p1] + nums[p2] < 0){
                        p1++;
                        continue;
                    }
                    //判断是否符合三元组
                    if (nums[i] + nums[p1] + nums[p2] == 0) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(nums[i]);
                        arrayList.add(nums[p1]);
                        arrayList.add(nums[p2]);
                        if (set.add(arrayList)){
                            list.add(arrayList);
                        }
                        p1++;
                        p2--;
                    }
                }
            }
        return list;
    }
}
