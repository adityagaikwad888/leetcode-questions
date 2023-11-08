#include <stdc++.h>
using namespace std;

bool sorted(vector<int> &nums)
{
    cout<<endl<<"your are in sorted"<<endl;
    for (int i = 0; i < nums.size() ; i++)
    {
        cout<<nums.at(i)<<" ";
    }
    
    for (int i = 0; i < nums.size() - 2 ; i++)
    {
        
        if (nums.at(i+1) - nums.at(i) != 1)
        {
            return false;
        }
    }
    return true;
}

bool isGood(vector<int> &nums)
{
    sort(nums.begin(), nums.end());
    int k = nums.size() - 1; 
    // cout<<nums.at(k)<<"  " <<nums.at(k - 1)<<endl;
    if (sorted(nums))
    {
        return true;
    }
        cout<<"what"<<endl;
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
    if (isGood(v))
    {
        cout << "OK" << endl;
    }

    return 0;
}