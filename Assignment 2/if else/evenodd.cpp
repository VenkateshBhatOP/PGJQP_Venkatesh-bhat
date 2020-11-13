#include<iostream>
using namespace std;
class Even_Odd
{
    int number;
    public: void evenodd()
    {
        cout<<"Enter a number:\n";
        cin>>number;
        if(number%2==0)
        {
            cout<<"The number is even";
        }
        else
        {
            cout<<"The number is odd";
        }
    }
};
int main()
{
    Even_Odd obj;
    obj.evenodd();
}
