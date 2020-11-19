#include<iostream>
using namespace std;
class Alphabets
{
    char i;
    public:void display()
    {
        for (i='A';i<='Z';i++)
        {
            cout<<" "<<i;
        }
    }
};
int main()
{
    Alphabets obj;
    obj.display();
}
