#include<iostream>
using namespace std;
class Reverse
{
    int num;
    public:void display()
    {
        for(num=10;num>=1;num--)
        {
            cout<<" "<<num;
        }
    }
};
int main()
{
    Reverse obj;
    obj.display();
}
