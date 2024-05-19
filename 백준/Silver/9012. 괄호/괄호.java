 import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNum = sc.nextInt();

        for (int i = 0; i < caseNum; i++) {
            String s = sc.next();
            String result = (isVPS(s)) ? "YES" : "NO";
            System.out.println(result);
        }
    }

    public static boolean isVPS(String s) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push(1);
                    break;
                case ')':
                    if (stack.empty()) {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}