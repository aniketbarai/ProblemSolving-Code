/*
Election season has started in Chefland and the election commission wants to know the count of eligible voters.
There are N people in Chefland where the age of the 
ith person in A[i]
Given that a person needs to be at least X years old to vote, find the number of eligible voters.

*/
#include <bits/stdc++.h>

using namespace std;

int main() {
    int n; //for testcase
    cin >> n;
    while (n--) {
        int people, limit;
        cin >> people >> limit;
        int arr[people];
        int count = 0; // count is use for counting num when condition passed.
        for (int i = 0; i < people; i++) {
            cin >> arr[i];
            if (arr[i] >= limit) {
                count++; //condition met so increment 1 vote 
            }
        }
        cout << count << endl;
    }

}