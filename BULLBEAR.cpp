#include <bits/stdc++.h>

using namespace std;

int main() {
    int testCase;
    cin >> testCase;
    for (int i = 0; i < testCase; i++) {
        int costPrice, sellPrice;
        cin >> costPrice >> sellPrice;
        if (costPrice > sellPrice) {
            cout << "Loss" << endl;
        }
        else if (sellPrice > costPrice) {
            cout << "Profit" << endl;
        }
        else {
            cout << "Neutral" << endl;
        }

    }

}