#include<iostream>
using namespace std;
class Function_Return
{
    int number;
    public: int ret()
    {
        cout<<"Enter a number:\n";
        cin>>number;
        int returningvalue=number*2;
        return returningvalue;
    }
};
int main()
{
    Function_Return obj;
    cout<<obj.ret();
}
