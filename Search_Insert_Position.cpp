#include <stdc++.h>
using namespace std;
// {1,2,3,5} target = 4;
int SI (vector<int> &nums, int target)
{
    for (int i = 0; i < nums.size() ; i++)
    {
        if (nums.at(i)==target)
        {
            return i;
        }
        else
        {
            if (target>nums.at(nums.size()-1))
            {
                return nums.size();
            }
            else if (nums.at(i)<target && target<nums.at(i+1))
            {
                return i+1;
            }
            
        }
    }
    return 0;
}

int searchInsert(vector<int> &nums, int target)
{
    return SI(nums,target);
}

int main()
{
    vector<int> v;
    int a,x,target;
    cin>>a;
    for (int i = 0; i < a; i++)
    {
        cin>>x;
        v.push_back(x);
    }
    cin>>target;
    cout<<searchInsert(v,target);
    
    return 0;
}