import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N value (at least 3): ");
        int N = sc.nextInt();

        while (N < 3) {
            System.out.println("The N value must be at least 3, Please re-enter");
            System.out.print("Enter the N value (at least 3): ");
            N = sc.nextInt();
        }

        for (int h = 1; h <= N; h++) {
            for (int i = N - h; i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= h; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}