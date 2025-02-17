public class Text18 {
    public static void main(String[] args) {
        int[] ints ={1,0,0,2,0,3,0};
        new Text18().moveZeroes(ints);
    }
    public void moveZeroes(int[] nums) {
        //先记录有多少个不为0的数
        int ans=0;
        int curr=0;
        if (nums.length==1){
            System.out.println("["+nums[0]+"]");
        }else {
            for (int i = 0; i <nums.length ; i++) {
                if (nums[i]!=0){
                    ans++;
                }
            }
            //把不为0的值一个一个填充到数组
            for (int i = 0; i <nums.length ; i++) {
                if (nums[i]!=0&&curr<=ans){
                    nums[curr]=nums[i];
                    curr++;
                    continue;
                }
            }
            for (int i=curr;i<nums.length;i++){
                nums[i]=0;
            }
            System.out.print("[");
            for (int i=0;i<nums.length;i++){
                if (i==nums.length-1){
                    System.out.print(nums[i]);
                }else {
                    System.out.print(nums[i]+",");
                }
            }
            System.out.print("]");
        }
    }
}
