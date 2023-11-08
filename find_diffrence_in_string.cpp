#include <stdc++.h>
using namespace std;

char findTheDifference(string s, string t)
{
    sort(s.begin(),s.end());
    s.push_back(1);
    sort(t.begin(),t.end());
    for (int i = 0; i < t.length() ; i++)
    {
        if (s[i] != t[i])
        {
            return t[i];
        }
        
    }
    return '0';
}