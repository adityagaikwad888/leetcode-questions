#include <stdc++.h>
using namespace std;

vector<int> evenOddBit(int n)
{
    vector<int> temp;
    int even_count = 0;
    int odd_count = 0;
    while (n>=1)
    {
        temp.push_back(n%2);
        n = n/2;
    }
    // for (int i = 0; i < temp.size()/2 ; i++)
    // {
    //     swap(temp.at(i),temp.at(temp.size()-1-i));
    // }
    for (int i = 0; i < temp.size() ; i++)
    {
        if ((i%2==0) && (temp.at(i) == 1))
           even_count++;
        if ((i%2==1) && (temp.at(i) == 1))
           odd_count++;
        
    }
    vector<int> temp1;
    temp1.push_back(even_count);
    temp1.push_back(odd_count);

    return temp1;
}

int main(){
    int n;
    cin>>n;
    vector<int> v;
    v = evenOddBit(n);
    for (int i = 0; i < v.size() ; i++)
    {
        cout<<v.at(i)<<" ";
    }
    
    return 0;
}