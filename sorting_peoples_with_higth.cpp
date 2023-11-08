#include <stdc++.h>
using namespace std;

///// Do same code with binary ????

int main()
{   vector<int> v;
    vector<string> u;

    v = {5,3,4};
    u = {"C","A","B"};
    int n=v.size() ;
    for (int x =0 ; x <= n ; x++ ){
        for (int i = x + 1; i < n; i++)
        {
            if (v.at(x) < v.at(i))
            {
                swap(v.at(x), v.at(i));
                swap(u.at(x), u.at(i));
            }
        }
    }
    for (int i = 0; i < v.size() ; i++)
    {
        cout<<v.at(i)<< " " ;
    }
    for (int i = 0; i < v.size() ; i++)
    {
        cout<<u.at(i)<< " " ;
    }
    
}