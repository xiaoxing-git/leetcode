import java.util.Optional;

public class Text23 {
    public static void main(String[] args) {
        String s="aaaa";
        new Text23().longestPalindrome(s);
    }
    public String longestPalindrome(String s) {
        //先遍历一遍所有字符
        if (s.length()<2){
            return s;
        }
        String str="";
        boolean flog=false;
        for (int i = 1; i <s.length() ;i++) {
            String log="";
            int l=i,r=i;
            char p1=s.charAt(i);
            char p2=s.charAt(i);

            while(p1==p2) {//匹配回文字串
                log+=p1;//先记录一半
                if (l-1>=0&&r+1<=s.length()-1){
                    p1 = s.charAt(l-- - 1);
                    p2 = s.charAt(r++ + 1);
                }else {
                    break;
                }
            }
            if (str.length()<log.length()){
                str=log;
            }
        }

        for (int i = 1; i <s.length() ; i++) {
            String log2="";
            int x=i-1,y=i;
            char p3=s.charAt(i-1);
            char p4=s.charAt(i);
            while (p3==p4){
                log2+=p3;
                if (x-1>=0&&y+1<=s.length()-1){
                    p3=s.charAt(x-- -1);
                    p4=s.charAt(y++ +1);
                }else {
                    break;
                }
            }
            if (str.length()<=log2.length()){
                str=log2;
                flog=true;
            }
        }
        if (flog){
            String str2="";
            for (int i=str.length()-1;i>=0;i--){
                str2+=str.charAt(i);
            }
            str=str2+str;//拼接
        }else {
            String str2="";
            for (int i=str.length()-1;i>=1;i--){
                str2+=str.charAt(i);
            }
            str=str2+str;//拼接
        }

        return str;
    }
}
