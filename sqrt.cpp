#include <stdc++.h>
using namespace std;

int main()
{
    int x;
    cin >> x;
    int s = 0, e = x;
    int ans=-13;
    long int mid = s + (e - s) / 2;
    while (s <= e)
    {
        if (mid * mid == x)
        {
            cout << mid << endl;
        }
        if (mid * mid > x)
        {
            e = mid - 1;
        }
        else
        {
            ans=mid;
            s = mid + 1;
        }
        mid = s + ( e - s) / 2 ;
    }
    return ans;
}