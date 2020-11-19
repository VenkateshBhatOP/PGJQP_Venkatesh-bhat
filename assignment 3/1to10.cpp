#include<iostream>
using namespace std;
class Numbers
{
    int num;
    public :void display()
    {
        for(num=1;num<=10;num++)
        cout<<num<<"\n";
    }
};
int main()
{
    Numbers obj;
    obj.display();
}
