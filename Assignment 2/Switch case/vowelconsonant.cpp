#include<iostream>
using namespace std;
class Vowel_Consonant
{
    char choice;
    public:void Case()
    {
        cout<<"Enter a character:";
        cin>>choice;
        switch(choice)
        {
            case 'a':cout<<"The entered character is a vowel";break;
            case 'e':cout<<"The entered character is a vowel";break;
            case 'i':cout<<"The entered character is a vowel";break;
            case 'o':cout<<"The entered character is a vowel";break;
            case 'u':cout<<"The entered character is a vowel";break;
            case 'A':cout<<"The entered character is a vowel";break;
            case 'E':cout<<"The entered character is a vowel";break;
            case 'I':cout<<"The entered character is a vowel";break;
            case 'O':cout<<"The entered character is a vowel";break;
            case 'U':cout<<"The entered character is a vowel";break;
            default:cout<<"The entered character is a consonant";
        }
    }
};
int main()
{
    Vowel_Consonant obj;
    obj.Case();
}
