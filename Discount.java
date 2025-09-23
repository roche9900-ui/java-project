//program to compute discount
/*
  *Ferdinand Roche
  *K63-11550-2024
  *Program to compute discount based on purchase amount
*/
import java.util.Scanner;
public class Discount {

    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        double discount;
    

        System.out.print("Enter purchase amount: ");
        double amount = scanner.nextDouble();

        if(amount > 5000){
            discount = amount * 0.10;
        } else if (amount >= 1000&& amount <= 5000) {
            discount = amount * 0.05;
        } else {
            discount = 0;
           
        }
        double amountToPay= amount - discount;

        System.out.println("Initial Amount: Ksh. " + amount);
        System.out.println("Discount: Ksh. " + discount);
        System.out.println("Amount to Pay: Ksh. " + amountToPay);

        scanner.close();
            
        }
    
}
