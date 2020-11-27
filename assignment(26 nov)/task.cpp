#include<iostream>
using namespace std;
class Employee
{
protected:
    int empId;
    char empName[25];
    float salary;
    void accept()
    {
        cout<<"------------------------------------------------------------------------------\n";
        cout<<"Enter the Employee ID: ";
        cin>>empId;
        cout<<"Enter the Employee name: ";
        cin>>empName;
        cout<<"Enter the salary: ";
        cin>>salary;
    }
};
class Hr:public Employee
{
    public:void display()

    {
        accept();
        cout<<"\n--------------------------------HR information-----------------------------------\n\n";
      cout<<"The ID of the HR is: "<<empId<<endl;
      cout<<"The name of the HR is: "<<empName<<endl;
      cout<<"The salary of the HR is: "<<salary<<endl;
      cout<<"\n===================================================================================="<<endl;
      system("\n\n pause");
    }
};
class  Programmer:public Employee

{
    public :void display()
    {
        accept();
        cout<<"\n------------------------------Programmer information------------------------------\n\n";
    cout<<"The ID of the programmer is: "<<empId<<endl;
    cout<<"The name of the Programmer is: "<<empName<<endl;
    cout<<"The salary of the Programmer is: "<<salary<<endl;
    }
};
int main()
{
    Hr c;
    Programmer c1;
    c.display();
    c1.display();
}
