#include<iostream>
using namespace std;
class Leap_Year
{
    int year=2020;
    public:void leapyear()
    {
        cout<<"Enter a year:\n";
        cin>>year;
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            cout<<"The entered year is a leap year";
        }
        else
        {
            cout<<"The entered year is not a leap year";
        }
    }
};
int main()
{
    Leap_Year obj;
    obj.leapyear();
}
