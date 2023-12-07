public class Fibonacci {

    public static void main(String[] args) {
        int n = 12;
        System.out.println("Number of guinea pig pairs at the end of the " + n + "th month: " + guineaPigPairs(n));
    }

    public static int guineaPigPairs(int n) {
        if (n <= 1) {
            return n;
        } else {
            return guineaPigPairs(n - 1) + guineaPigPairs(n - 2);
        }
    }
}