import java.util.Scanner;
public class fibonacci {
    // Fungsi rekursif Fibonacci
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah suku Fibonacci: ");
        int n = input.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah:");

        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i));
            if (i < n) {
                System.out.print(", ");
            }
        }
    }
}

