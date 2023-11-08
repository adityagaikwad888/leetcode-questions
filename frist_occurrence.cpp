#include <stdc++.h>
using namespace std;

int strStr(string haystack, string needle)
{
    for (int i = 0; i < haystack.length(); i++)
    {
        if(haystack.substr(i, needle.length()) == needle )
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    string x, n;
    cin>>x>>n;
    cout<<strStr(x,n)<<endl;
    return 0;
}