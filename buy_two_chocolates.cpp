#include <stdc++.h>
using namespace std;

int buyChoco(vector<int> &prices, int money)
{
    int m = INT_MIN;
    int ok = 0;
    for (int i = 0; i < prices.size(); i++)
    {
        for (int j = prices.size() - 1; j > i; j--)
        {
            if (prices.at(i) + prices.at(j) < money)
            {
                int temp = money - (prices.at(i) + prices.at(j));
                if (temp >= m)
                {
                    m = temp;
                    ok = 1;
                }
            }
            else if (prices.at(i) + prices.at(j) == money)
            {
                ok = 2;
            }
        }
    }
    if (ok == 1)
    {
        return m;
    }
    else if (ok == 2)
    {
        return 0;
    }
    return money;
}

int main()
{
    vector<int> v;
    int a, x, m;
    cin >> a;
    for (int i = 0; i < a; i++)
    {
        cin >> x;
        v.push_back(x);
    }
    cout << "Enter money : ";
    cin >> m;
    cout << buyChoco(v, m);
    return 0;
}