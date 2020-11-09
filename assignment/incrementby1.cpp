#include<iostream>
using namespace std;
class Increment
{
    int num1,num2;
    public: void inc()
    {
        cout<<"Enter a number: \n";
        cin>>num1;
        num2=num1+1;
                cout<<"the increment of the number is: \n"<<num2;}
};
int main()
{
    Increment obj;
    obj.inc();
}




