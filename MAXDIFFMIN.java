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
            int max, min;
            if (x > y && x > z) {
                max = x;
            }
            else if (y > x && y > z) {
                max = y;
            }
            else {
                max = z;
            }
            if (x < y && x < z) {
                min = x;
            }
            else if (y < x && y < z) {
                min = y;
            }
            else {
                min = z;
            }
            System.out.println(max - min);
            testCase--;
        }

    }
}