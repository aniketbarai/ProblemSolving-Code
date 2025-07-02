#include <bits/stdc++.h>

using namespace std;

int main() {
    int testCase;
    cin >> testCase;
    for (int i = 0; i < testCase; i++) {
        int x, y, z;
        cin >> x;
        cin >> y;
        cin >> z;
        int area = x * y;
        int budget = z / 2;
        if (area > budget) {
            cout << "0" << endl;
        } else {
            int wall = budget / area;
            cout << wall << endl;
        }


    }

}