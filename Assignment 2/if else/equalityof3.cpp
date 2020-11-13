#include<iostream>
using namespace std;
class Equality
{
    int num1,num2,num3;
    public:void equ()
    {
        cout<<"Enter three numbers:\n";
        cin>>num1>>num2>>num3;
        if(num1==num2 && num2==num3)
            {
                cout<<"The three numbers are equal";
            }
            else
            {
                cout<<"The three numbers are unequal";
            }
        }
    };

int main()
{
    Equality obj;
    obj.equ();
}
