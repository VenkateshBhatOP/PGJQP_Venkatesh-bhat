#include<iostream>
using namespace std;
class Addition
{
    int num1,num2,result;
    public: void add()
    {
        cout <<"Enter any two numbers:\n";
        cin>>num1>>num2;
        result=num1+num2;
        cout<<"result:"<<result<<endl;
        if(result>100)
        {
            cout<<"The result is greater than 100";
        }
        else
        {
            cout<<"The result is not greater than 100";
        }
    }

};
int main()
{
    Addition obj;
    obj.add();
}
