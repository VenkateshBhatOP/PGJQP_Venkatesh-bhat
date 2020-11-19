#include<iostream>
using namespace std;
class Exponent_Base
{
    int i=0,result=1,base,exp;
    public:void display()
    {
        cout<<"Enter the base:";
        cin>>base;
        cout<<"Enter the exponent:";
        cin>>exp;
        {


        for(;i<exp;i++)
            result=result*base;
        {
            cout<<base<<"^"<<exp<<"="<<result;
        }
    }
}
};
int main()
{
    Exponent_Base obj;
    obj.display();

}
