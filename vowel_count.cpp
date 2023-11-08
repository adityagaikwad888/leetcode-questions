//// Durva's Birthday Chalenge ////

#include <stdc++.h>
using namespace std;

int main()
{
    int count_a = 0;
    int count_e = 0;
    int count_i = 0;
    int count_o = 0;
    int count_u = 0;
    int count_ = 0;

    string s;
    getline(cin, s);
    int lenght = s.length();
    for (int i = 0; i < lenght; i++)
    {
        if (s[i] == 'a')
        {
            count_a++;
        }
        else if (s[i] == 'e')
        {
            count_e++;
        }
        else if (s[i] == 'i')
        {
            count_i++;
        }
        else if (s[i] == 'o')
        {
            count_o++;
        }
        else if (s[i] == 'u')
        {
            count_u++;
        }
        else if (s[i] == ' ')
        {
            count_++;
        }
    }
    std::cout << "a : " << count_a << endl
              << "e : " << count_e << endl
              << "i : " << count_i << endl
              << "o : " << count_o << endl
              << "u : " << count_u << endl;
    float total_char = lenght - count_;
    int rest = (lenght - (count_a + count_e + count_i + count_o + count_u + count_));


    std::cout << "a : " << (count_a / total_char) * 100 << "%" << endl
              << "e : " << (count_e / total_char) * 100 << "%" << endl
              << "i : " << (count_i / total_char) * 100 << "%" << endl
              << "o : " << (count_o / total_char) * 100 << "%" << endl
              << "u : " << (count_u / total_char) * 100 << "%" << endl
              << "rest : " << (rest / total_char) * 100 << "%" << endl;

}