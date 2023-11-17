import java.util.Scanner;
public class NestedLoop_2341720222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City-" + i);
            for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Day-" + (j +  1) + ": ");
            temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        
        for (int i = 0; i < temps.length; i++) {
            System.out.print("City-" + (i + 1) + ": ");
            double totalTemperature = 0.0;
            //foreach :
            for (double temperature : temps[i]) {
                System.out.printf("%.2f ", temperature);
                totalTemperature += temperature;
            }
            System.out.println();
            //avarage
            double avg = totalTemperature / temps[i].length;
            System.out.printf("Avarage: %.2f%n", avg);
            System.out.println();
        }
        scanner.close();
    }
}