#include<iostream>
#include<string.h>
using namespace std;
class Reverse
{
    char str[20];
    public:void display()
    {
        cout<<"Enter a string to reverse:";
        gets(str);
        strrev(str);
        cout<<"Reverse of the string:"<<str;
    }
};
int main()
{
    Reverse obj;
    obj.display();
}
