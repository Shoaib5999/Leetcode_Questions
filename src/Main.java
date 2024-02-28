import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        Hashtable<Integer, Integer> h1 = new Hashtable<>();
        int i = 0;

        while (i < nums.length) {
            int key = nums[i];
            if (h1.containsKey(key)) {
                h1.put(key, h1.get(key) + 1);
            } else {
                h1.put(key, 1);
            }
            i++;
        }
        Set<Map.Entry<Integer,Integer>>values = h1.entrySet();
        System.out.println(values);
    }
}