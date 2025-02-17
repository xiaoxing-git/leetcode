import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Text20 {
    public static void main(String[] args) {
        int[] ints={5,4,6,7,9,3,10,9,5,6};
        new Text20().findDisappearedNumbers(ints);
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (set.add(i)){
                list.add(i);
            }
        }
        return list;
    }
}
