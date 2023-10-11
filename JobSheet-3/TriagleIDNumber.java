import java.util.Scanner;

public class TriagleIDNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int base, height;
        float area;

        System.out.print("input base: ");
        base=sc.nextInt();
        System.out.print("Input height: ");
        height = sc.nextInt();

        area = base * height / 2;
        System.out.print("Area of the triangle: " + area);

    }
}
