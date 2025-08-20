import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase--> 0) {
            int turns = sc.nextInt();
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int x = 2 * (180 + turns);
            int y = t1 + t2;
            int timeRemaining = x - y;
            System.out.println(timeRemaining);
        }

    }
}