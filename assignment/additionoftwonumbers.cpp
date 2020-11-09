#include<iostream>
using namespace std;
class Addition
{
    int num1,num2,result;
    public: void add()
    {
        cout<<"Enter the first number \n";
        cin>>num1;
        cout<<"Enter the second number \n";
        cin>>num2;
        result=num1+num2;
        cout<<"the result is: \n"<<result;
    }
};
int main()
{
    Addition obj;
    obj.add();
}
