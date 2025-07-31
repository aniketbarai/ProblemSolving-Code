import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            int count = 1;
            for (int i = 0; i < n - 1; i++) {
                if (d[i] <= d[i + 1]) {
                    count++;
                }
            }
            if (count == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
