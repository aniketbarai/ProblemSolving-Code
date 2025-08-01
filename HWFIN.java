/*Chef just realized he has a ton of homework due tomorrow!

Chef has several worksheets of questions with him. Each worksheet has exactly 
Y
Y questions in it.
Chef only has the time to complete at most 
10
10 worksheets before the submission deadline.

Chef has previously answered 
X
X questions, and he needs to answer at least 
100
100 questions in total to get a full score for the homework.
Will Chef be able to get a full score?
*/
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
        if (((y * 10) + x) >= 100) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }


}