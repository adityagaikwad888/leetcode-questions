#include <stdc++.h>
using namespace std;

void twoSum(vector<int> &nums, int target)
{
    int x,y;
    for (int i = 0; i < nums.size(); i++)
    {
        for (int j = i ; j < nums.size(); j++)
        {

            if (nums.at(i)+nums.at(j)==target)
            {
                if (nums.at(i)!=nums.at(j) || i!=j)
                {
                    cout<<i<<j<<endl;
                }
                
            }
            
        }
        
    }
    
}

int main()
{
    vector<int> v;
    int a,x,t;
    cin>>a;
    for (int i = 0; i < a; i++)
    {
        cin>>x;
        v.push_back(x);
    }
    cout<<"Enter target : ";
    cin>>t;
    twoSum(v,t);
    
    return 0;
}