import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase != 0) {
            int rentPrice = sc.nextInt();
            int costPrice = sc.nextInt();
            int monthReq = sc.nextInt();
            if ((rentPrice * monthReq) >= costPrice) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
            testCase--;
        }
        sc.close();
    }
}