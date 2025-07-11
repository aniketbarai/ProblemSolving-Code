/*
Chess Ratings 651

Alice has recently started playing Chess. Her current rating is X. She noticed that when she wins a game, her rating increases by 8 points.

Can you help Alice in finding out the minimum number of games she needs to win in order to make her rating greater than or equal to Y ?
*/

#include <stdio.h>

int main() {
    int testCase;
    scanf("%d", & testCase);
    for (int i = 0; i < testCase; i++) {
        int curRating, reqRating;
        scanf("%d %d", & curRating, & reqRating);
        if (curRating == reqRating || curRating > reqRating) {
            printf("0\n");
        }
        else if (reqRating > curRating) {
            int win = 8;
            int count = 0;
            while (curRating < reqRating) {
                int n = curRating + win;
                curRating = n;
                count++;
            }
            printf("%d\n", count);
        }

    }
    return 0;
}