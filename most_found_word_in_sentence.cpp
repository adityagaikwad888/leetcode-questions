#include <stdc++.h>
using namespace std;

int mostWordsFound(vector<string> &sentences)
{
    vector<int> v;
    for (int i = 0; i < sentences.size(); i++)
    {
        string x = sentences.at(i);
        if (x.length() == 1)
        {
            if (x[0] == ' ')
            {
                v.push_back(0);
            }
            else
            {
                v.push_back(1);
            }
        }
        else
        {
            int count = 0;
            for (int j = 0; j < x.length(); j++)
            {
                if (x[j] == ' ')
                {
                    count++;
                }
            }
            v.push_back(count + 1);
        }
    }
    sort(v.begin(), v.end());
    return v.at(v.size() - 1);
}

int main()
{
    vector<string> temp;
    
    temp.push_back("a");
    temp.push_back("I am hacker with name mr.x");
    cout<<mostWordsFound(temp)<<endl;
    
    return 0;
}