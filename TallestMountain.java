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
            int arrSize = sc.nextInt();
            int tallestMount = 0;
            int pos = -1;
            int[] arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > tallestMount) {
                    tallestMount = arr[i];
                    pos = tallestMount;
                }
            }
            System.out.println(pos);
            testCase--;
        }

    }
}
