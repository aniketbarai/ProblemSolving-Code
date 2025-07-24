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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int a = (100 - x) * z;
            int b = (a + y) * 10;
            System.out.println(b);
            testCase--;
        }
        sc.close();

    }
}