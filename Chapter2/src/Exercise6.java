import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price: ");
        float price = scanner.nextFloat();
        double tax = (price*8.25/100);
        double total = price + tax;
        System.out.printf("The tax is: %f\n", tax);
        System.out.printf("The total is: %f\n", total);
    }
}
