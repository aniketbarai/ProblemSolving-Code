import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            int sumCup = x;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                if (y > a[i])
                    sumCup += 0;
                else {
                    a[i] -= y;
                    sumCup += a[i];
                }
            }
            if (sumCup < sum) {
          System.out.println("COUPON");
            }
            else {
                System.out.println("NO COUPON");
            }
            // System.out.println(sum + " "+ sumCup);
        }
    }
}
