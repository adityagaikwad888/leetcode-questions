

///// Geting stackover flow error ......  //////

#include <stdc++.h>
using namespace std;
double forpos(double x, long long z)
{
    long n = abs(z);
    if (n == 0)
        {
            return 1;
        }

    double temp = forpos(x, n - 1);
    return x * temp;
}

double myPow(double x, long long z)
{   
    if (z>0)
    {
        return forpos(x,z);
    }
    else if (z<0)
    {
        return 1/forpos(x,z);
    }
    return 1;      
}

int main()
{
    double x;
    long n;
    cin >> x >> n;
    cout << myPow(x, n) << endl;
    return 0;
}