#include<iostream>
using namespace std;
class Swap
{
    int num1,num2;
    public:void acc()
    {
        cout<<"Enter any two numbers:\n";
        cin>>num1>>num2;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        cout<<"The numbers after swapping will be:\n"<<num1<<endl<<num2;
    }
};
int main()
{
    Swap obj;
    obj.acc();
}
