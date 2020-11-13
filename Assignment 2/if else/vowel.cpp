#include<iostream>
using namespace std;
class Vowel_Consonant
{
    char a,vowel,consonant;
    public:void alpha()
    {
        cout<<"Enter a character\n";
        cin>>a;
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            cout<<"The character is a vowel";

        }
        else
        {
            cout<<"The character is a consonent";
        }

    }
};
int main()
{
    Vowel_Consonant obj;
    obj.alpha();
}
