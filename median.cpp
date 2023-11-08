#include <stdc++.h>
using namespace std;

double med(vector<int> &nums1, vector<int> &nums2)
{

    double median;
    for (int i = 0; i < nums2.size(); i++)
    {
        nums1.push_back(nums2.at(i));
    }
    sort(nums1.begin(), nums1.end());
    int s = nums1.size();
    if (s % 2 == 1)
    {
        median = nums1.at(s / 2);
    }
    else if (s % 2 == 0)
    {
        double x = nums1.at(s / 2);
        double y = nums1.at((s / 2) - 1);
        median = (x + y) / 2;
    }
    return median;
}

double findMedianSortedArrays(vector<int> &nums1, vector<int> &nums2)
{
    return med(nums1,nums2);
}

int main()
{
    vector<int> u, v;
    int a, b, x;
    cin >> a;
    for (int i = 0; i < a; i++)
    {
        cin >> x;
        u.push_back(x);
    }
    cin >> b;
    for (int i = 0; i < b; i++)
    {
        cin >> x;
        v.push_back(x);
    }

    cout << findMedianSortedArrays(u, v);

    return 0;
}