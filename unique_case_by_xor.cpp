#include <stdc++.h>
using namespace std;

int singleNumber(vector<int> &nums)
{
    int sum = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        sum ^= nums.at(i); //
    }
    return sum;
}

int main()
{
    vector<int> v;
    int a, x;
    cin >> a;
    for (int i = 0; i < a; i++)
    {
        cin >> x;
        v.push_back(x);
        /* code */
    }
    cout << singleNumber(v) << endl;
}