#include <stdc++.h>
using namespace std;

int main(){
    string x = "eemckxmckx";
    string part = "emckx";
    while (x.length() > x.find(part) && x.length() != 0)
    {
        x.erase(x.find(part),part.length());
    }
    
    cout<<x<<endl;
    return 0;
}