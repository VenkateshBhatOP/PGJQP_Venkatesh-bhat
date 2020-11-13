#include<iostream>
using namespace std;
class Add_Multiply

{
    int num1,num2,result1,result2;
    public:void great()
    {
        cout<<"Enter any two numbers that you want to add:\n";
        cin>>num1>>num2;
        result1=num1+num2;
        cout<<"The result of addition is: "<<result1;
        cout<<endl;
        result2=num1*num2;
        cout<<"The result of multiplication is:"<<result2;
        cout<<endl;
        if(result1>result2)
        {
            cout<<"The result of addition is greatest\n"<<result1<<endl;

        }
        else
        {
            cout<<"The result of multiplication is greatest\n"<<result2;
        }


    }
};
int main()
{
    Add_Multiply obj;
    obj.great();
}
