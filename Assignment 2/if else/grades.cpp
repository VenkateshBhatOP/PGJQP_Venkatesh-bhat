#include<iostream>
using namespace std;
class Student
{
    string name;
    int marks,a;
    public:void accept()
    {
        cout<<"Enter the name of the student:";
        cin>>name;
        cout<<"Enter the registration number:";
        cin>>a;
        cout<<"Enter the marks of the student:";
        cin>>marks;
        if(marks>=90)
        {
            cout<<"Grade A";
        }
        else if(marks>=80&&marks<90)
{
    cout<<"Grade B";


    }
    else if(marks>=60&&marks<80)
    {
        cout<<"Grade C";
    }
    else if(marks>=45&&marks<60)
    {
        cout<<"Grade D";
    }
    else
    {
        cout<<"Fail";
    }
    }
};
int main()
{
    Student obj;
    obj.accept();
}
