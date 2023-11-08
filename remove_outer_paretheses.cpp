#include <stdc++.h>
using namespace std;

int main(){
    string x,v;
    x = "()(()())";
    for (int i = 0; i < x.length() -1 ; i++)
    {
        if (x[i] == '(' && x[i+1] == ')')
        {
            v.push_back(x[i]);
            v.push_back(x[i+1]);
        }
        
    }
    cout<<v<<endl;
    return 0 ;
}