import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            int secMax = 0;
            // System.out.println(max);
            for (int i = 0; i < n; i++) {
                if (a[i] > secMax && a[i] != max) {
                    secMax = a[i];
                }
            }
            System.out.println(secMax + max);
        }
    }
}
