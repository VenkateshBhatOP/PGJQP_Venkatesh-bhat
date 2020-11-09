#include<iostream>
using namespace std;
class Multiplication
{
    float a,b,result;
    public: void mul()
    {
        cout<<"Enter the first decimal number: \n";
        cin>>a;
        cout<<"Enter the second decimal number: \n";
        cin>>b;
        result=a*b;
        cout<<"the product is \n"<<result;
    }
};
int main()
{
    Multiplication obj;
    obj.mul();

}
