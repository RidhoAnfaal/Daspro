import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N value (at least 5): ");
        int N = sc.nextInt();

        while (N < 5) {
            System.out.println("The N value must be at least 3, Please re-enter");
            System.out.print("Enter the N value (at least 5): ");
            N = sc.nextInt();
        }

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}