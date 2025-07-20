/*Imagine you are standing on a chessboard, and you can move like a king (one square in any direction).
To reach from one square to another, the maximum of horizontal or vertical difference is the steps you need.

Example:
From (1,1) to (4,3), horizontal = 3 steps, vertical = 2 steps
So Chessboard distance = max(3, 2) = 3
*/
#include <stdio.h>

int main() {
    int testCase;
    scanf("%d", & testCase);
    while (testCase--) {
        int x1, y1, x2, y2;
        scanf("%d %d %d %d", & x1, & y1, & x2, & y2);
        int num1 = (x1 - x2);
        int num2 = (y1 - y2);
        if (num1 < 0) {
            num1 = -(x1 - x2);
        }
        if (num2 < 0) {
            num2 = -(y1 - y2);
        }
        if (num1 > num2) {
            printf("%d\n", num1);
        }
        else {
            printf("%d\n", num2);
        }
    }

}