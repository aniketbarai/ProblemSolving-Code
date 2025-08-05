/*
Nitin and Sobhagya were playing a game with coins. If Sobhagya has more coins then he is winning, otherwise Nitin is winning. Note that this means if both Nitin and Sobhagya have the same number of coins, then Nitin is winning.

Initially Nitin has A coins while Sobhagya has B coins. Then Ritik came and gave his C coins to the player who is not winning currently, after which Satyarth came and repeated the same process (gave his D coins to the player who is not winning currently).

Find the final winner of the game.

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- != 0) {
            int nitinCoin = sc.nextInt();
            int sobhagyaCoin = sc.nextInt();
            int ritikCoin = sc.nextInt();
            int satyarthCoin = sc.nextInt();

            if (sobhagyaCoin >= nitinCoin) {
                nitinCoin += ritikCoin;
            }
            else {
                sobhagyaCoin += ritikCoin;
            }
            //for satyarth case
            if (sobhagyaCoin > nitinCoin) {
                nitinCoin += satyarthCoin;
            }
            else {
                sobhagyaCoin += satyarthCoin;
            }

            if (nitinCoin >= sobhagyaCoin) {
                //System.out.println(nitinCoin+","+sobhagyaCoin);
                System.out.println("N");
            }
            else {
                // System.out.println(nitinCoin +","+sobhagyaCoin);
                System.out.println("S");
            }
        }

    }
}