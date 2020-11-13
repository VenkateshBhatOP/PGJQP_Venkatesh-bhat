#include<iostream>
using namespace std;
class Swap_Numbers
{

    int num1,num2,c;
    public:void accept()
    {
        cout<<"Enter two numbers:\n";
        cin>>num1>>num2;

        cout<<"The numbers after swapping:\n"<<num2<<endl<<num1;
    }
};
int main()
{
    Swap_Numbers obj;
    obj.accept();
}
