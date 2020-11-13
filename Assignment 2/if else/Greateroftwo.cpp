#include<iostream>
using namespace std;
class Greatest
{
    int number1,number2;
    public: void great()
    {
        cout<<"Enter the two numbers:\n";
        cin>>number1>>number2;
        if(number1>number2)
        {
            cout<<"First number is the greatest";
        }
        else
        {
            cout<<"Second number is the greatest";
        }
    }
};
int main()
{
    Greatest obj;
    obj.great();
}
