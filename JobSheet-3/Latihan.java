import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        float V, I, R1, R2, R3, R4, Rp, Rtotal;

        System.out.print("Input R1: ");
        R1=sc.nextInt();
        System.out.print("Input R2: ");
        R2=sc.nextInt();
        System.out.print("Input R3: ");
        R3=sc.nextInt();
        Rp = (1 / R1) + (1 / R2) + (1 / R3);
        
        System.out.print("Input R4: ");
        R4=sc.nextInt();
        Rtotal = Rp + R4;
        System.out.println("Rtotal = " + Rtotal);

        System.out.print("Input I: ");
        I=sc.nextInt();
        V = I * Rtotal;
        System.out.print("V = " + V);




    }
}
