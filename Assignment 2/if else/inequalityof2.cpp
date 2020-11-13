#include<iostream>
using namespace std;
class Inequality
{
    int num1,num2;
    public:void unequal()
    {
        cout<<"Enter any two numbers\n";
        cin>>num1>>num2;
        if(num1!=num2)
        {
            cout<<"The two numbers are unequal";

        }
        else
        {
            cout<<"The two numbers are equal";
        }
    }
};
int main()
{
    Inequality obj;
    obj.unequal();
}
