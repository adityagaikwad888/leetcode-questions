#include <stdc++.h>
using namespace std;

// int reverse(int x)
// {
//     int n;
//     if (x < 0)
//     {
//         n = 1;
//     }
//     string s;
//     s = to_string(x);
//     int e = s.length();
//     for (int i = 0; i < e / 2; i++)
//     {
//         swap(s.at(i), s.at((e - 1) - i));
//     }
//     if (n == 1)
//     {
//         return stoi(s) * (-1);
//     }
//     return stoi(s);
// }


int reverse (int x)
{
    int rev = 0;
    int digit;
   while(x){

    digit= x%10;
    rev=(rev*10)+digit;
    x /=10;
   }
   return rev;
}

int main()
{
    int x;
    cin >> x;
    cout << reverse(x);
    return 0;
}