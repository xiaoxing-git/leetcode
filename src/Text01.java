import java.util.Arrays;


public class Text01 {
    public static void main(String[] args) {
        Text01 text01 = new Text01();
        int a[]={3,2,4};
        int t=6;
	//text02
        System.out.println(text01.twoSum(a,t));

    }


    public int[] twoSum(int[] nums, int target) {
        int[] rs = new int[2];
        for (int i = 0; i <nums.length; i++) {
            for (int j = i + 1; j <nums.length; j++) {//不能为同一个下标，从下一个开始计算所以用j=i+1
                if (nums[i] + nums[j] == target) {
                    rs[0] = i;
                    rs[1] = j;
                }
            }
        }
        return rs;
    }

}
