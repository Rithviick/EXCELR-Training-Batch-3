import java.util.Scanner;

public class Demo020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        getFibonacciSeries(n);

        scanner.close();
    }

    public static void getFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        int a = 0, b = 1;
        System.out.print(a);

        for (int i = 1; i < n; i++) {
            System.out.print("," + b);
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }
}
