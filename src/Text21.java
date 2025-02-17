import java.util.HashSet;

public class Text21 {
    public static void main(String[] args) {
        String s="advdf";
        new Text21().lengthOfLongestSubstring(s);
    }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max=0,ans;
        int j=0;
        for (int i=0;i<s.length();i++){
            ans=set.size();
            while (j<s.length()){
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    ans++;
                    j++;
                }else break;
            }
            max=Math.max(ans,max);
            set.remove(s.charAt(i));
        }
        return max;
    }
}
