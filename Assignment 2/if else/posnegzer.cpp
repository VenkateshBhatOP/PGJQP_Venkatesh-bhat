#include<iostream>
using namespace std;
class Numbers
{
    int number;
    public :void num()
    {
        cout<<"Enter a number:";
        cin>>number;
        if (number>0)
        {
            cout<<"The number is positive";
        }
        else if(number<0)
        {
            cout<<"The number is negative";
        }
        else
        {
            cout<<"The number is zero";
        }
    }
};
int main()
{
    Numbers obj;
    obj.num();
}
