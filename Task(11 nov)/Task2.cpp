#include<iostream>
using namespace std;
class Task_Two
{
    int number;
    public:int ret(int a,int b)
    {
        return a*b;
    }
};
int main()
{
    Task_Two obj;
    int number1,number2;
    {
        cout<<"Enter two numbers:\n";
        cin>>number1>>number2;
        cout<<obj.ret(number1,number2);
    }
}
