public class Text05 {
    public int climbStairs(int n) {
        //使用递归
        //上一个台阶有一种
        //上两个台阶有两种
        //上三个台阶就等先上一个台阶，再上两个台阶，也就是上一个台阶的种数+上两个台阶的总数
        //可得 f(n)=f(n-1)+f(n-2)
        //递归出口为f(1)=1,f(2)=2
        //n=45时会超时。。。
        //-----------------------------------------------------
        //那我就动态规划，考虑到递归时底层的数会被反复计算，那就放在数组里存放
        //这样调用时就可以直接取，不需要计算
        //动态规划公式为a[n]=a[n-1]+a[n-2]
        //最后返回a[n]
        return dp(n);
        //return f(n);
    }
    public int f(int n){
        if (n==1) return 1;
        if (n==2) return 2;
        return f(n-1)+f(n-2);
    }
    public int dp(int n){
        int a[]=new int[50];
        a[1]=1;
        a[2]=2;
        for (int i = 3; i <=n ; i++) {
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
}
