#include <stdc++.h>
using namespace std;

bool isPowerOfTwo(int n)
{
    for (int i = -31 ; i < 31; i++)
    {
        if (n == pow(2,i))
        {
            return true;
        }
        
    }
    return false;
    
}

int main()
{

    int n;
    cin>>n;
    if (isPowerOfTwo(n))
    {
        cout<<"correct"<<endl;
    }
    else 
    {
        cout<<"false"<<endl;
    }
    
    return 0;
}