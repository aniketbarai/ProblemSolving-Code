import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int size = sc.nextInt();
            int units = sc.nextInt();

            for (int i = 0; i < size; i++) {
                int demand = sc.nextInt();
                if (demand > units) {
                    System.out.print("0");
                } else {
                    units -= demand;
                    System.out.print("1");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}