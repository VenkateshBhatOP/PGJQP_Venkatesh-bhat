#include<iostream>
using namespace std;
class Alphabet
{
char c;
    public:void alpha()
    {
        cout<<"Enter a character:\n";
        cin>>c;
        if(c>='a'&&c<='z'||c>='A'&&c<='Z')
        {
            cout<<"The character is an alphabet";
        }
        else{cout<<"The character is not an alphabet";}
        }
    };

int main()
{
    Alphabet obj;
    obj.alpha();
}

