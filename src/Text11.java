public class Text11 {
    public static void main(String[] args) {
        int[] nums={1,4,2,1,2};
        new Text11().singleNumber(nums);
    }
    public int singleNumber(int[] nums) {
        for (int i = 1; i <nums.length ; i++) {
            nums[0]^=nums[i];
        }
        return nums[0];
    }
}
