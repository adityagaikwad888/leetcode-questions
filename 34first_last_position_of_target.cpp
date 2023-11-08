#include <stdc++.h>
using namespace std;
class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
           vector<int> temp;
           
           int s = 0;
           int ans = -1,ans1 = -1;
           int e = nums.size()-1;
           int mid ;
           while (s<=e)
           {
              mid = (s+e)/2;
              if(nums.at(mid)<target)
              {
                  s = mid + 1;

              }   
              else if(nums.at(mid)>target)
              {
                  e = mid - 1;

              }
              else if(nums.at(mid)==target)
              {
                 ans = mid;
                 e = mid -1 ;
              }

           }
           
           s = 0;
           e = nums.size()-1;

           while (s<=e)
           {
              mid = (s+e)/2;
              if(nums.at(mid)<target)
              {
                  s = mid + 1;

              }   
              else if(nums.at(mid)>target)
              {
                  e = mid - 1;

              }
              else if(nums.at(mid)==target)
              {
                 ans1 = mid;
                 s = mid + 1 ;
              }

           }
           temp.push_back(ans);
           temp.push_back(ans1);
           return temp;

    }
};