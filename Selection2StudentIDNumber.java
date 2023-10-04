import java.util.Scanner;
public class Selection2StudentIDNumber {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.print("Nilai uas   : ");
        float finalExam = input05.nextFloat();
        System.out.print("Nilai uts   : ");
        float midExam = input05.nextFloat();
        System.out.print("Nilai Kuis  : ");
        float quiz = input05.nextFloat();
        System.out.print("Nilai tugas   : ");
        float assignment = input05.nextFloat();

        float total = (finalExam * 0.4f) + (midExam * 0.3f) + (quiz * 0.1f) + (assignment * 0.2f);
        //String message = total < 65 ? "Retake" : "Pass";
        //System.out.println("Final Grade = " + total + " and the decission is " + message);        0o
        
        if(total > 80 && total <= 100){
            System.out.println("Final Grade = A");
        
        }else if(total > 73 && total <= 80 ){
        System.out.println("Final Grade = B+");
        
        }else if(total > 65 && total <= 73 ){
        System.out.println("Final Grade = B");
        
        }else if(total > 60 && total <= 65 ){
        System.out.println("Final Grade = C+");

        }else if(total > 50 && total <= 60 ){
        System.out.println("Final Grade = C");
        
        }else if(total > 39 && total <= 50 ){
        System.out.println("Final Grade = D");

        }else{
            System.out.println("Final Grade = E");
        }

    }
}