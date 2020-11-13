#include<iostream>
using namespace std;
class Least_Number
{
    int number1,number2,number3;
    public:void least()
    {
        cout<<"Enter the three numbers:\n";
        cin>>number1>>number2>>number3;
        if(number1<number2 && number1<number3)
        {
            cout<<"First number is the least\n"<<number1;
        }
        else if(number2<number1 && number2<number3)
        {
            cout<<"Second number is the least\n"<<number2;
        }
        else
        {
            cout<<"Third number is the least\n"<<number3;
        }
    }
};
int main()
{
    Least_Number obj;
    obj.least();
}

