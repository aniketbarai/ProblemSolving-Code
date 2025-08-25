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
            int rectLength = sc.nextInt();
            int rectWidth = sc.nextInt();
            int sqlength = sc.nextInt();

            int areaSq = sqlength * sqlength;
            int areaRect = rectLength * rectWidth;

            if (areaSq >= areaRect) {
                // Case 0: already fine
                System.out.println(0);
            }
            else if (rectLength <= areaSq || rectWidth <= areaSq) {
                // Case 1: can fix by setting the other side = 1
                System.out.println(1);
            }
            else {
                // Case 2: need two operations
                System.out.println(2);
            }
        }
    }
}