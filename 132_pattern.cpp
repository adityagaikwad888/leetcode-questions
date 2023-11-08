#include <stdc++.h>
using namespace std;

// 1,2,3,4
// 1 3 2

bool find132pattern(vector<int> &nums)
{
    int x = nums.size() - 2;
    for (int i = 0; i < x; i++)
    {
        // cout << "corrected" << endl;
        for (int j = i; j < nums.size(); j++)
        {
            // cout << "corrected" << endl;
            if (nums.at(i) < nums.at(j))
            {
                for (int k = j; k < nums.size(); k++)
                {
                    if (nums.at(i) < nums.at(k) && nums.at(j) > nums.at(k))
                    {
                        cout << nums.at(i) << " " << nums.at(j) << " " << nums.at(k) << endl;
                        return true;
                    }
                }
            }
        }
    }
    return false;
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
    }
    if (find132pattern(v))
    {
        cout << "found" << endl;
    }
    else
    {
        cout << "Not found" << endl;
    }

    return 0;
}