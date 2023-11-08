#include <stdc++.h>
using namespace std;

vector<string> fizzBuzz(int n)
{
    vector<string> temp;
    string x;
    for (int i = 1 ; i <= 3 ; i++)
    {
        if (( i%3 == 0 ) && (i%5 == 0)){
            temp.push_back("FizzBuzz");
        }else if (i%5 == 0)
        {
            temp.push_back("Buzz");
        }else if (i%3 == 0)
        {
            temp.push_back("fizz");
        }else
        {
            x = to_string(i);
            temp.push_back("x");
        }          
    }
    
}

int main()
{
    return 0;
}