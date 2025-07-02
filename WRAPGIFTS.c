#include <stdio.h>

int main() {
    int testCase;
    scanf("%d", & testCase);
    for (int i = 0; i < testCase; i++) {
        int height, length, width;
        scanf("%d %d %d", & height, & length, & width);
        //printf("%d %d %d\n",height,length,width);
        int sqcm = (2 * (height * length + length * width + width * height));
        //printf("%d ",sqcm);
        int gift = (10 * 100) / sqcm;
        printf("%d\n", gift);
    }
    return 0;
}