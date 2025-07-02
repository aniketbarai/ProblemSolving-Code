#include <bits/stdc++.h>

using namespace std;

int main() {
    int testCase;
    cin >> testCase;
    for (int i = 0; i < testCase; i++) {
        int problemTarget;
        cin >> problemTarget;
        int solved;
        cin >> solved;
        int solutionPercentage = (solved * 100) / problemTarget;
        if (solutionPercentage >= 50) {
            cout << "YES" << endl;
        }
        else {
            cout << "NO" << endl;
        }
    }

}