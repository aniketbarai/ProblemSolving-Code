/*
Chef has N candies. He has to distribute them to exactly M of his friends such that each friend gets equal number of candies and each friend gets even number of candies. Determine whether it is possible to do so.

NOTE: Chef will not take any candies himself and will distribute all the candies.

*/

#include <stdio.h>

int main() {
    int testCase;
    scanf("%d", & testCase);

    while (testCase--) {
        int candies, friends;
        scanf("%d %d", & candies, & friends);
        if ((candies % friends == 0) && (candies / friends) % 2 == 0) {
            printf("YES\n");
        }
        else {
            printf("NO\n");
        }

    }
    return 0;
}