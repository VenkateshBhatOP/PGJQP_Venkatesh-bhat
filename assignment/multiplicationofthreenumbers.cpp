#include<iostream>
using namespace std;
class Multiplication
{
    float num1,num2,num3,result;
    public: void mul()
    {
        cout<<"Enter the first number \n";
        cin>>num1;
        cout<<"Enter the second number \n";
        cin>>num2;
        cout<<"Enter the third number \n";
        cin>>num3;
        result=num1*num2*num3;
        cout<<"the product is: \n"<<result;

    }
};
int main()
{
    Multiplication obj;
    obj.mul();
}
