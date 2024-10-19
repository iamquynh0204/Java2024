import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] calendarDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        System.out.print("Input day of week:");
        int dayOfWeek = scanner.nextInt();
        System.out.println("It is " + calendarDays[dayOfWeek - 1]);
    }
}
