#include<iostream>
using namespace std;
class Equality
{
    int number1,number2;
    public: void equ()
    {
        cout<<"Enter two numbers:";
        cin>>number1>>number2;
        if(number1==number2)
        {
            cout<<"The two numbers are equal";

        }
        else
        {
            cout<<"The two numbers are not equal";
        }
    }
};
int main()
{
    Equality obj;
    obj.equ();
}
