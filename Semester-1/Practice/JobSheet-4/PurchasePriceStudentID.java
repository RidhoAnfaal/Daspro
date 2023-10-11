import java.util.Scanner;
public class PurchasePriceStudentID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int price, quantity, pageCount;
        double discount, totalPrice, purchasePrice, totalDiscount;
        String bookBrand;
        
        System.out.print("Input price: ");
        price = input.nextInt();
        System.out.print("Input quantity: ");
        quantity = input.nextInt();
        System.out.print("Input page count: ");
        pageCount = input.nextInt();
        System.out.print("Input book brand: ");
        bookBrand= input.next();
        System.out.print("Input discount: ");
        discount = input.nextDouble();

        totalPrice = price * quantity;
        totalDiscount = totalPrice * discount;
        purchasePrice = totalPrice - totalDiscount;

        System.out.println("Total discount: "+totalDiscount);
        System.out.println("Final purchase price: "+purchasePrice);

    }
}
