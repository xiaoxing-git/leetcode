public class Text24 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        new Text24().maxArea(height);
    }
    public int maxArea(int[] height) {
        //双指针，指针p1指向第一个数，指针p2指向第二个数
        int p1=0;
        int p2=height.length-1;
        int max=0;
        int ans=0;
        //逐步往中间靠拢
        while (p1!=p2){
        //计算当前值
            if (height[p1]<height[p2]){
                ans=height[p1]*(p2-p1);
                p1++;
            }else {
                ans=height[p2]*(p2-p1);
                p2--;
            }
        //更新最大值
            max=Math.max(ans,max);
        }
        //返回最大值
        return max;
    }
}
