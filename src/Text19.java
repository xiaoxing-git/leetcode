public class Text19 {
    public static void main(String[] args) {
        int n=3;
        new Text19().countBits(n);
    }
    public int[] countBits(int n) {
        //遍历n的每一个数
        //建立一个大小为n+1的数组
        int[] ints = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int ans=0;
            int j=i;
            while (j>0){
                if ((j&1)==1){
                    ans++;
                }
                j>>=1;
            }
            ints[i]=ans;
        }
        return ints;
    }
}
