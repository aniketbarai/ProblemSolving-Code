import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x < y) {
            System.out.println("INCREASED");
        }
        else if (x > y) {
            System.out.println("DECREASED");
        }
        else {
            System.out.println("SAME");
        }

    }
}