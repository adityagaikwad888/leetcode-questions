#include <stdc++.h>
using namespace std;

// int minBitFlips(int start, int goal)
// {

// }

int minBitFlips(int start, int goal)
{
    int x = start ^ goal;
    int count = 0;
    while (x)
    {
        if (x & 1)
            count++;
        x >>= 1;
    }
    return count;
}

int main()
{
    int a,b;
    cin>>a>>b;
    cout<<minBitFlips(a,b)<<endl;
    
}