#include<iostream>
using namespace std;
class Eligibility
{

    int age;
    char yes,no;
    public:void vote()

    {
        cout<<"Enter the age of the person:\n";
        cin>>age;
        if(age>=18)
        {
            cout<<"The person is eligible to vote";
            cin>>yes;
        }
        else
        {
            cout<<"The person is not eligible to vote";
            cin>>no;
        }
    }
};
int main()
{
    Eligibility obj;
    obj.vote();
}
