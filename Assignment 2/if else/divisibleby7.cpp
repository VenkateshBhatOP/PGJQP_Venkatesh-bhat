#include<iostream>
using namespace std;
class Divisibility
{
    int num1;
    public:void div()
    {
        cout<<"Enter a number: \n";
        cin>>num1;
        if(num1%7==0)
        {
            cout<<"The entered number is divisible by 7";

        }
        else
        {
            cout<<"The entered number is not divisible by 7";
        }

            }
};
int main()
{
    Divisibility obj;
    obj.div();
}
