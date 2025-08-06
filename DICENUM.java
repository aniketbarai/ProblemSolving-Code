import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int[] aliceRolls = new int[3];
            int[] bobRolls = new int[3];

            // Alice ke dice numbers
            for (int i = 0; i < 3; i++) {
                aliceRolls[i] = sc.nextInt();
            }

            // Bob ke dice numbers
            for (int i = 0; i < 3; i++) {
                bobRolls[i] = sc.nextInt();
            }

            // Sort karo descending order mein
            Arrays.sort(aliceRolls);
            Arrays.sort(bobRolls);
            StringBuilder aliceScore = new StringBuilder();
            StringBuilder bobScore = new StringBuilder();

            for (int i = 2; i >= 0; i--) {
                aliceScore.append(aliceRolls[i]);
                bobScore.append(bobRolls[i]);
            }

            int alice = Integer.parseInt(aliceScore.toString());
            int bob = Integer.parseInt(bobScore.toString());

            if (alice > bob) {
                System.out.println("Alice");
            } else if (bob > alice) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
    }
}