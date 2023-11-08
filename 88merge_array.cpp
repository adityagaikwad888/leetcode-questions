#include <stdc++.h>
using namespace std;

void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)
{
    for (int i=0 ; i < m ; i++)
    {
        nums1.pop_back();
    }
    for (int i = 0; i < n ; i++)
    {
        nums1.push_back(nums2.at(i));
    }
    sort(nums1.begin(),nums1.begin()+(m+n));   
}