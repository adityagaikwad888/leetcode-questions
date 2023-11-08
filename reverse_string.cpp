#include <stdc++.h>
using namespace std;

void reverseString(vector<char> &s)
{
    
    int e = s.size();

    for (int i = 0; i < e/2 ; i++)
    {
        swap(s.at(i),s.at((e-1)-i));
    }
    for (int i = 0; i < s.size(); i++)
    {
        cout<<s.at(i)<<" ";
    }
        
}
int main()
{
    vector<char> v;
    int s;
    char x;
    cin>>s;
    for (int i = 0; i < s; i++)
    {
        cin>>x;
        v.push_back(x);
    }
    cout<<"cheked"<<endl;
    reverseString(v);
    
    return 0;
}