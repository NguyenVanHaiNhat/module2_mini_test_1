import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh góc vuông 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Nhập cạnh góc vuông 2 (khác cạnh góc vuông 1): ");
        int side2 = scanner.nextInt();

        int row = Math.max(side1, side2);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}