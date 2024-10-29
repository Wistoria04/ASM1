public class StackMemoryEx {
    public static void main(String[] args) {
        int result = multi(4);
        System.out.println("Result: " + result);
    }

    public static int multi(int n) {
        if (n == 1) {
            return 1;
        } else {
            return multi(n - 1) * n;
        }
    }
}
