#include <stdc++.h>
using namespace std;

void rotate(vector<int> &nums, int k)
{
    int n = nums.size();
    vector<int> temp;
    temp = nums;
    for (int i = 0; i < n; i++)
    {
        nums[(k + i) % n] = temp.at(i);
    }
}