#include <stdc++.h>
using namespace std;

int missingNumber(vector<int> &nums)
{
    sort(nums.begin(),nums.end());
    
    // int k = nums.at(nums.size());
    for (int i = 0; i < nums.size() ; i++)
    {
        if (nums.at(i)!=i)
        {
            return i;
        }  
    }
    if (nums.size()>1)
    {
        return nums.size();
    }
    return 1;
    
}

int main()
{
    vector<int> v;
    v = {0,1,2,3};
    cout << endl
         << missingNumber(v) << endl;
    return 0;
}