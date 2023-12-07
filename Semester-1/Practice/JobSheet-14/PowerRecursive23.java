import java.util.Scanner;

public class PowerRecursive23 {
    static int calculatePower (int base, int pow) {
        if(pow == 0) 
            return 1;
        else    
            return base * calculatePower(base, pow-1);
        }

        static void printPowerSeries(int base, int pow) {
            //System.out.print(base);
            if (pow == 0) {
                System.out.print("1 = 1");
            }else {
                System.out.print(base);
                for (int i = 1; i <= pow; i++) {
                    System.out.print("x" + base);
                }
                System.out.print("x1 = " + calculatePower(base, pow));
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input Base Number: ");
            int base = input.nextInt();
            System.out.print("Input Power Number: ");
            int power = input.nextInt();

            System.out.println("Result of "+base+" power "+power+" = "
            +calculatePower(base, power));
            printPowerSeries(base, power);

            input.close();
        }           
}