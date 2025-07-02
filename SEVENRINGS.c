#include <stdio.h>

int main() {
    int t;
    scanf("%d", & t);

    while (t--) {
        int n, x;
        scanf("%d %d", & n, & x);
        int ph = n * x;
        // printf("%d\n", ph);
        if (ph >= 10000 && ph < 100000)
        {
            printf("YES\n");
        }
        else {
            printf("NO\n");
        }
    }

}