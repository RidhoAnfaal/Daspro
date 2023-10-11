import java.util.Scanner;

public class ProjekAkhir {

    public static void main(String[] args) {
        //var scanner
        Scanner input = new Scanner(System.in);

        //var declear
        String name, address, job;
        int loanTerm, menu, date;
        double interest=0.005, remainingBalance, monthlyInterest, monthlyInstallments, loanAmount, remainingLoans;
        //var end


        System.out.println("██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗\r\n" + //
                           "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝\r\n" + //
                           "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗  \r\n" + //
                           "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝  \r\n" + //
                           "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗\r\n" + //
                           " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝\r\n" + //
                "                                                              ");
        //menu
        System.out.println("----- CHOOSE MENU -----\n");
        //System.out.println("    1. Register\n    2. Balance check\n    3. Loan application\n    4. Loan repayment\n    0. Exit\n-----------------------");
        System.out.println("    1. Register\n    2. Login user\n    0. Exit\n-----------------------");
        System.out.print("-- Enter menu: ");
        menu = input.nextInt();
        /*switch (menu) {
            case 1:
                System.out.print("Enter full name: ");
                name = input.next();
                System.out.print("Enter address: ");
                address = input.next();
                System.out.print("How much balance did you input: ");
                double balance = input.nextDouble();
                System.out.println("Registrasi berhasil\n\n");
                
                System.out.println("----- CHOOSE MENU -----\n");
                System.out.println("    1. Register\n    2. Balance check\n    3. Loan application\n    4. Loan repayment\n    0. Exit\n-----------------------");
                System.out.print("-- Enter menu: ");
                menu = input.nextInt();

            switch (menu) {
                case 2:
                    System.out.println(""+balance);
                    break;
            
                default:
                    break;
            }
        }*/
        switch (menu) {
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("Enter full name: ");
                name = input.next();
                System.out.println("Birth date(dd mm yy): ");
                date = input.nextInt();
                System.out.println("Address: ");
                address = input.nextLine();
                System.out.println("REGISTRATION SUCCESS");

                System.out.println("    1. Register\n    2. Login user\n    0. Exit\n-----------------------");
                System.out.print("-- Enter menu: ");
                menu = input.nextInt();
            
            case 2:
                System.out.println("user"+name);
            }
                   






















            }    
                
        
        }
        
        