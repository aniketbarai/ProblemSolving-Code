/*

Minimum Bottles
There are N identical water bottles, each of which has a capacity of X liters.
The ith bottle initially contains A[i] liters of water.
You want to go on a trip and want to carry all your water with you.
However, to not make packing a hassle, you also want to carry the least number of bottles with you.

You can transfer any amount of water from one bottle to another, provided there is no spillage and no bottle contains more than X liters. Water from one bottle can be transferred to different bottles if you wish to do that.

What is the minimum number of bottles that you can carry with you, while still having all your water?

*/


#include <stdio.h>

int main() {
    int testCase;
    scanf("%d", &testCase);

    while (testCase--) {
        int bottles, maxCapacityEach;
        scanf("%d %d", &bottles, &maxCapacityEach);
        int arr[bottles];
        int sum = 0;
        for (int j = 0; j < bottles; j++) {
            scanf("%d", &arr[j]);
            sum += arr[j];
        }
        int minBottle = (sum + maxCapacityEach - 1) / maxCapacityEach;
        printf("%d\n", minBottle);
    }

    return 0;
}
