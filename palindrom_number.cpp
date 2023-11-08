#include <stdc++.h>
using namespace std;

bool isPalindrome(int x)
{
    if(x>=0){
    int num = x ,rev = 0 , digit ;
    while (x)
    {
        digit = x%10;
        rev = rev*10 + digit;
        x = x/10 ;
    }
    if (rev == num )
    {
        return true;
    }
    }
    return false;
    
}

int main()
{
    int x;
    cin >> x;
    if (isPalindrome(x))
    {
        cout << "OK" << endl;
    }
    return 0;
}