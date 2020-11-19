#include <iostream>
using namespace std;
class Name
{
    char i;
    public: void display()
    {
        for(i=0;i<5;i++)
            cout<<"Venkatesh\n";
    }

};
int main()
{
    Name obj;
    obj.display();
}
