#include <stdc++.h>
using namespace std;

// vector<int> intersection(vector<int> &nums1, vector<int> &nums2)
// {
//     vector<int> temp;
//     for (int i = 0; i < nums1.size(); i++)
//     {
//         for (int j = 0; j < nums2.size(); j++)
//         {
//             if (nums1.at(i) == nums2.at(j))
//             {
//                 if (nums1.size() < nums2.size())
//                 {
//                     temp.push_back(nums1.at(i));
//                     nums2.at(i) = INT_MIN;
//                 }
//                 else
//                 {
//                     temp.push_back(nums1.at(i));
//                     nums1.at(i) = INT_MIN;
//                 }
//             }
//         }
//     }
// }


vector<int> intersection(vector<int> &nums1, vector<int> &nums2)
{
    vector<int> temp;
    for (int i = 0; i < nums1.size(); i++)
    {
        for (int j = 0; j < nums2.size(); j++)
        {
            if (nums1.at(i) == nums2.at(j))
            {
                temp.push_back(nums2.at(j));
                nums2.at(j) = INT_MIN;
                break;
            }
        }
    }
    cout<<"ok"<<endl;
    for (int i = 0; i < temp.size(); i++)
    {
        for (int j = temp.size() - 1; j > i; j--)
        {
            if (temp.at(i) == temp.at(j))
            {
                temp.erase(temp.begin() + j);
            }
        }
    }
    return temp;
}

int main()
{
    vector<int> v, u, ans;
    int a, x, b;
    cin >> a;
    for (int i = 0; i < a; i++)
    {
        cin >> x;
        v.push_back(x);
    }
    cout << "enter " << endl;
    cin >> b;
    for (int i = 0; i < b; i++)
    {
        cin >> x;
        u.push_back(x);
    }
    ans = intersection(v, u);
}