#include<iostream>
using namespace std;
class Employee
{
    string name;
    float salary;
    public:void accept()
    {
        cout<<"Enter the name of the Employee:\n";
        cin>>name;
        cout<<"Enter the Salary of the Employee:\n";
        cin>>salary;

    }
    void display()
    {
        cout<<"Name of the Employee:"<<name;
        cout<<endl;
        cout<<"Salary of the Employee:"<<salary;
        cout<<endl;

    }



    };

int main()
{
    Employee emp[2];
    for(int i=0;i<2;i++)
    {
        emp[i].accept();
    }
    for(int i=0;i<2;i++)
    {
        emp[i].display();
    }
}
