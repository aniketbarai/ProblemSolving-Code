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
            int rows = 3;
            int cols = 2;
            int arr[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols - 1; j++) {
                    if (arr[i][j] + arr[i][j + 1] > max) {
                        max = arr[i][j] + arr[i][j + 1];
                    }
                }
            }
            System.out.println(max);
        }
    }
}