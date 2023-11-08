#include <stdc++.h>
using namespace std;

vector<int> plusOne(vector<int> &digits)
{
    int k = 0, j = 1;
    vector<int> ans;
    for (int i = 0; i < digits.size(); i++)
    {
        if (digits[i] != 9)
        {
            k = 1;
        }
    }
    if (k == 0)
    {
        ans.push_back(1);
        for (int i = 1; i <= digits.size(); i++)
        {
            ans.push_back(0);
        }
        return ans;
    }
    if (digits.at(digits.size() - 1) != 9)
    {
        digits.at(digits.size() - 1) += 1;
    }
    else
    {
        for (int i = digits.size() - 1; i >= 0; i--)
        {
            if (digits.at(i) == 9 && j == 1)
            {
                digits.at(i) = 0;
                if (digits.at(i - 1) != 9)
                {
                    digits.at(i - 1) += 1;
                    j = 0;
                }
            }
        }
    }
    return digits;
}