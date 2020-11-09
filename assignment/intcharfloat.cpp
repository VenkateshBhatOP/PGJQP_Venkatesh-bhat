#include<iostream>
using namespace std;
class Data_Type
{
    int a;
    char b;
    float c;
    public: void display()
    {
        cout<<"enter the int value \n";
        cin>>a;
        cout<<"enter the name \n";
        cin>>b;
        cout<<"enter the float value \n";
        cin>>c;
        cout<<a<<b<<c;
    }
};
int main()
{
    Data_Type obj;
    obj.display();
}
