import java.util.HashMap;

public class Text14 {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        new Text14().majorityElement(nums);
    }
    public int majorityElement(int[] nums) {
        //使用哈希表
        //key为nums的值，v为该值出现的次数
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (hashMap.get(nums[i])==null){
                hashMap.put(nums[i],1);
            }else {
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }
            if (hashMap.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
