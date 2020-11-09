#include<iostream>
using namespace std;
class Quotient_Remainder
{
    int a,b,Quotient,Remainder;
    public :void div()
    {
        cout<<"Enter two numbers : \n";
        cin>>a>>b;
        Quotient=a/b;
        cout<<"The Quotient of the two numbers is:"<<Quotient;
        Remainder=a%b;
        cout<<'\t';
        cout<<"The Remainder of the two numbers is:"<<Remainder;


    }
};
int main()
{
    Quotient_Remainder obj;
    obj.div();
}
