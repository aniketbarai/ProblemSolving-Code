import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    int val = b[i] * 2;
                    if (val >= a[i]) {
                        count++;
                    }
                } else if (a[i] == b[i]) {
                    count++;
                }
                else {
                    if (b[i] > a[i]) {
                        int val = a[i] * 2;
                        if (val >= b[i]) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
