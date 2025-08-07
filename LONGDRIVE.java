import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T--> 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X >= Y) {
                System.out.println(0);
            } else {
                // Calculate minimum extra hours h:
                // h >= ceil(10 * (Y - X) / (100 - Y))
                int numerator = 10 * (Y - X);
                int denominator = 100 - Y;

                // To get ceil of division, we use:
                int h = (numerator + denominator - 1) / denominator;

                System.out.println(h);
            }
        }

        sc.close();
    }
}