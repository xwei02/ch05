import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year: ");
        int year = scanner.nextInt();
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input day:");
        int day = scanner.nextInt();
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        for (int i = 0; i < month-1; i++) {
            result += days[i];
        }
        result+=day;
        System.out.println(result);
    }
}
