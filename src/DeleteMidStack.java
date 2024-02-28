import java.util.Stack;

public class DeleteMidStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(2);
        s.push(12);
        s.push(11);
        s.push(13);
        s.push(5);
        s.push(6);
        s.push(7);
        DeleteMid(s, s.size()/2+1);
        for (Integer value : s) {
            System.out.println(value);
        }
    }

    private static void DeleteMid(Stack<Integer> s, int n) {
        if (n == 1) {
            s.pop();
            return;
        }

        Integer temp = s.peek();
        s.pop();
        DeleteMid(s, n - 1);
        s.push(temp);
    }
}
