#include<iostream>
using namespace std;
class Great_Number
{
    int number;
    public:void greatnum()
    {
        cout<<"Enter a number:\n";
        cin>>number;
        if(number>10)
        {
            cout<<"The number is greater than 10";
        }
        else
        {
            cout<<"The number is less than 10";
        }

    }
};
int main()
{
    Great_Number obj;
    obj.greatnum();
}
