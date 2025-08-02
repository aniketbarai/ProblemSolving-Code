/*
Food Balance

Chef is preparing to cook his dinner.
There are two dishes Chef can make. The first one contains F1 grams of fat and P1 grams of protein, while the second contains F2 grams of fat and P2 grams of protein.

Chef would like the quantity of fats and proteins he consumes to be as close to each other as possible, i.e., the absolute difference between the amount of fats and proteins should be as small as possible.
  Help Chef by telling him which dish he'll choose; or if both dishes have the same difference.
*/
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int firstFood = Math.abs(x - y);
        int secFood = Math.abs(a - b);

        if (secFood > firstFood) {
            System.out.println("FIRST");
        } else if (secFood < firstFood) {
            System.out.println("SECOND");
        } else {
            System.out.println("BOTH");
        }
    }
}