/*
Easy Pronunciation
Words that contain many consecutive consonants, like "schtschurowskia", are generally considered somewhat hard to pronounce.
We say that a word is hard to pronounce if it contains 4 or more consonants in a row; otherwise it is easy to pronounce. For example, "apple" and "polish" are easy to pronounce, but "schtschurowskia" is hard to pronounce.

You are given a string S consisting of N lowercase Latin characters. Determine whether it is easy to pronounce or not based on the rule above — print YES if it is easy to pronounce and NO otherwise.

For the purposes of this problem, the vowels are the characters  {a,e,i,o,u} and the consonants are the other 21 characters.
*/
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase--> 0) {
            int size = sc.nextInt();
            sc.nextLine(); // consume the leftover newline

            String str = sc.nextLine().toLowerCase().trim();
            char[] chars = str.toCharArray();
            // System.out.println(size);
            int count = 0;
            boolean hard = false;
            for (int i = 0; i < size; i++) {
                // System.out.print(chars[i]);
                if (chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] != 'u') {
                    count++;
                    if (count >= 4) {
                        hard = true;
                        break;
                    }
                }
                else {
                    count = 0;
                }

            }
            if (hard) {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
            // System.out.println("");
        }
    }
}
