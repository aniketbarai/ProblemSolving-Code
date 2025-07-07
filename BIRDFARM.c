#include <stdio.h>
int main() {
    int testCase;
    scanf("%d", &testCase);
    
    for (int i = 0; i < testCase; i++) {
        int chickenLeg, duckLeg, totalLeg;
        scanf("%d %d %d", &chickenLeg, &duckLeg, &totalLeg);

        // Check if both can divide total legs
        if (totalLeg % chickenLeg == 0 && totalLeg % duckLeg == 0) {
            printf("ANY\n");
        }
        // Check if neither can divide total legs
        else if (totalLeg % chickenLeg != 0 && totalLeg % duckLeg != 0) {
            printf("NONE\n");
        }
        // Only chicken can divide
        else if (totalLeg % chickenLeg == 0) {
            printf("CHICKEN\n");
        }
        // Only duck can divide
        else if (totalLeg % duckLeg == 0) {
            printf("DUCK\n");
        }
    }

    return 0;
}