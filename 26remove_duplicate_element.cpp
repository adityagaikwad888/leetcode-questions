#include <stdc++.h>
using namespace std;

int removeDuplicates(vector<int> &nums)
{
    // int s=0 , e = nums.size();

    for (int i = 0; i < nums.size() ; i++)
    {
        for (int j = nums.size()-1 ; j > i ; j--)
        {
           if (nums.at(i)==nums.at(j))
           {
              nums.erase(nums.begin()+j);
           }
           
        }
        
    }   
    int k = nums.size();
    for (int i = 0; i < nums.size(); i++)
    {
        cout<<nums.at(i)<<" ";
    }
    cout<<endl;
    return k;   
}

int main()
{
    vector<int> v;
    int a,x;
    cin>>a;
    for (int i = 0; i < a; i++)
    {
       cin>>x;
       v.push_back(x);
    }

    cout<<removeDuplicates(v)<<endl;
    
}