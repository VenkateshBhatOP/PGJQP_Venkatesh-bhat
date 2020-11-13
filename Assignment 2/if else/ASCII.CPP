#include<iostream>
using namespace std;
class ASCII
{
    char a;
    public: void code()
    {
        cout<<"Enter a character:\n";
        cin>>a;
        cout<<"ASCII value of the character is:"<<(int)a;
    }
};
int main()
{
    ASCII obj;
    obj.code();
}
