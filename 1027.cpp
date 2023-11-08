#include <stdc++.h>
using namespace std;

string removeDuplicates(string s)
{
    for (int i = 0; i < s.length()-1; i++)
    {
        if (s[i] == s[i + 1])
        {
            s.erase(i,2);
            i--;
            i--;
        }
    }
    return s;
}

int main()
{
    string s = "abccba";
    cout << removeDuplicates(s) << endl;
    return 0;
}