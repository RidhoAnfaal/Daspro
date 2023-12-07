public class DescendingSequenceRecursive {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Using Recursive Function:");
        recursiveFunction(n);

        System.out.println("\nUsing Iterative Function:");
        iterativeFunction(n);
    }

    public static void recursiveFunction(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            recursiveFunction(n - 1);
        }
    }

    public static void iterativeFunction(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}