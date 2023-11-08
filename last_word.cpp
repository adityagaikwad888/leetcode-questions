#include <stdc++.h>
using namespace std;

int lengthOfLastWord(string s)
{
    int count = 0;
    

    for (int i = s.length()-1; i >= 0; i--)
    {
        if (s[i] != ' ')
        {
            count++;
            if (s[i - 1] == ' ' )
            {
                return count;
            }
        }
    }
    return count;
}

int main()
{
    string x;
    getline(cin,x);
    cout<<lengthOfLastWord(x)<<endl;
    return 0;
}