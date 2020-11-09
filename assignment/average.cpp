#include<iostream>
using namespace std;
class Average
{
    int num1,num2,num3,num4,num5,Average;
    public :void avg()
    {
        cout<<"Enter the first number: \n";
        cin>>num1;
        cout<<"Enter the second number: \n";
        cin>>num2;
        cout<<"Enter the third number: \n";
        cin>>num3;
        cout<<"Enter the fourth number: \n";
        cin>>num4;
        cout<<"Enter the fifth number:\n";
        cin>>num5;
        Average=(num1+num2+num3+num4+num5)/5;
        cout<<"The average of the above five numbers is: "<<Average;
    }
};
int main()
{
    Average obj;
    obj.avg();
}
