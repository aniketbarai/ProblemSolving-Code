#include <stdio.h>
int main() {
    int testCase;
    scanf("%d", & testCase);
    for (int t = 0; t < testCase; t++){
        int size;
        scanf("%d", & size);
        int arr[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            scanf("%d", &arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        printf("%d\n",max);
    }
}