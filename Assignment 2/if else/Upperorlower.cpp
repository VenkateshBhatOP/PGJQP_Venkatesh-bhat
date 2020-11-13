#include<iostream>
using namespace std;
class Upper_Lower
{
    char alphabet;
    public:void alpha()
    {
        cout<<"Enter a character:\n";
        cin>>alphabet;
        if(alphabet>='A'&&alphabet<='Z')
        {
            cout<<"The character is an upper case letter";
        }
        else if(alphabet>='a'&&alphabet<='z')
        {
            cout<<"The character is a lower case letter";

        }
        else
        {
            cout<<"The character is invalid";
        }
    }
};
int main()
{
    Upper_Lower obj;
    obj.alpha();
}
