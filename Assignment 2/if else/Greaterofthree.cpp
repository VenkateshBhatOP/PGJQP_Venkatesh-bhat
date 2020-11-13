#include<iostream>
using namespace std;
class Greatest
{
    int number1,number2,number3;
    public:void great()
    {
        cout<<"Enter the three numbers:\n";
        cin>>number1>>number2>>number3;
        if(number1>number2 && number1>number3)
        {
            cout<<"First number is the greatest";
        }
        else if(number2>number1 && number2>number3)
        {
            cout<<"Second number is the greatest";
        }
        else
        {
            cout<<"Third number is the greatest";
        }
    }
};
int main()
{
    Greatest obj;
    obj.great();
}
