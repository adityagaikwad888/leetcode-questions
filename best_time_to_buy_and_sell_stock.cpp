#include <stdc++.h>
using namespace std;

int maxProfit(vector<int> &prices)
{
    int min = INT_MAX;
    int max_profit = INT_MIN;
    for (int i = 0; i < prices.size() ; i++)
    {
        if (prices.at(i)<min)
        {
            min = prices.at(i);
        }
        if ((prices.at(i)-min>= max_profit ))
        {
            max_profit = prices.at(i) - min ;
        }     
    }
    return max_profit;
    
}

int main()
{
}