public class SummationRecursive {

    public static void main(String[] args) {
        int n = 8;
        System.out.println("Sum using Recursive Function: " + summationRecursive(n));
    }

    public static int summationRecursive(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + summationRecursive(n - 1);
        }
    }
}