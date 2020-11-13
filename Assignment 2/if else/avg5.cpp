#include<iostream>
using namespace std;
class Average
{
    float num1,num2,num3,num4,num5;
    public:void avg()
    {
        cout<<"Enter any five numbers:\n";
        cin>>num1>>num2>>num3>>num4>>num5;
        if(((num1+num2+num3+num4+num5)/5)>10)
        {
            cout<<"The average of five numbers is greater than 10";

        }
        else
        {
            cout<<"The average of five numbers is not greater than 10";
        }
    }
};
int main()
{
    Average obj;
    obj.avg();
}
