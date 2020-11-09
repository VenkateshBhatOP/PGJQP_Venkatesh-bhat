#include<iostream>
using namespace std;
class Simple_Interest
{
float Principal,SimpleInterest;
int rate,time;
public:void Int()
{
    cout<<"Enter the Principal balance: \n";
    cin>>Principal;
    cout<<"Enter the Rate of Interest: \n";
    cin>>rate;
    cout<<"Enter the time in secs: \n";
    cin>>time;
    SimpleInterest=(Principal*time*rate)/100;
    cout<<"The Simple Interest is: \n"<<SimpleInterest;
}

};
int main()
{
    Simple_Interest obj;
    obj.Int();
}

