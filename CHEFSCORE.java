import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase--> 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (Y == 0) {
                System.out.println("YES");
            }
            else {
                int flag = 0;
                for (int i = 1; i <= N; i++) {
                    int possNum = i * X;
                    if (possNum == Y) {
                        flag = 1;
                    }
                }
                if (flag == 1) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}