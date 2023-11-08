#include <stdc++.h>
using namespace std;

string isHappy(int n)
{
    long x = n , z = 0;
    while (z < 730)
    {
        int digit, sum = 0;
        vector<int> temp;
        while (x > 0)
        {
            digit = x % 10;
            x /= 10;
            temp.push_back(digit);
        }

        for (int i = 0; i < temp.size(); i++)
        {  
            int square = temp.at(i)*temp.at(i);
            sum = sum + square;
        }

        if (sum == 1)
        {
            return "OK";
        }
        x = sum;
        z++;
        // cout<<"Reached"<<endl;
    }
    return "NOT";
}

int main(){

    cout<<isHappy(19)<<endl;
    return 0;
}