import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int num2 = scanner.nextInt();
        int temp, gcd=0;
        while(num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        gcd = num1;
        System.out.println("\n GCD =  " + gcd);
    }
}
