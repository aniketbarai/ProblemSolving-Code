import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int currTime = sc.nextInt();
        if (currTime >= 2050) {
            System.out.println("Yes");
        }
        else {
            int timeExt = currTime + 25;
            if (timeExt >= 2050) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
    }
}