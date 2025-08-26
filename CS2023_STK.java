import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) b[i] = scanner.nextInt();

            int omStreak = 0, addyStreak = 0;
            int countA = 0, countB = 0;

            for (int i = 0; i < n; i++) {
                // Om
                if (a[i] != 0) {
                    countA++;
                    omStreak = Math.max(omStreak, countA);
                } else {
                    countA = 0;
                }

                // Addy
                if (b[i] != 0) {
                    countB++;
                    addyStreak = Math.max(addyStreak, countB);
                } else {
                    countB = 0;
                }
            }

            if (addyStreak > omStreak) {
                System.out.println("Addy");
            } else if (omStreak > addyStreak) {
                System.out.println("Om");
            } else {
                System.out.println("Draw");
            }
        }
    }
}