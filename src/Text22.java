

public class Text22 {
    public static void main(String[] args) {
        int x=1;
        int y=4;
        new Text22().hammingDistance(x,y);
    }
    public int hammingDistance(int x, int y) {
        int i=Integer.bitCount(x ^ y);
        return i;
    }
}
