#include<iostream>
using namespace std;
class StaticfunEx
{
    static int num;
    int num1=1;
    public: static void display()
    {
        cout <<"The value of num1 is: "<<num1;//error

        cout<<"The value of num is: "<<num;//output

    }
};
int StaticfunEx::num=2;
int main()
{
 StaticfunEx::display();
}
