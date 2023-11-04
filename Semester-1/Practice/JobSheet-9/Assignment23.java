import java.util.Scanner;
public class Assignment23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements;
        double average;
        
        System.out.print("Input number of elements: ");
        numberOfElements = sc.nextInt();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Input the value of element number-"+(i+1)+ " : ");
            array[i] = sc.nextInt();
        }

        int highestValue = array[0];
        int lowestValue = array[0];
        int total = array[0];

        for (int i = 1; i < numberOfElements; i++) {
            if (array[i] > highestValue) {
                highestValue = array[i];
            }
            if (array[i] < lowestValue) {
                lowestValue = array[i];
            }
            total += array[i];
        }
        average = (double) total / numberOfElements;
    
        System.out.println("Highest value: "+highestValue);
        System.out.println("Lowest value: "+lowestValue);
        System.out.println("Average: "+average);
        sc.close();
    }
}