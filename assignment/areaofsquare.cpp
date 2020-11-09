#include<iostream>
using namespace std;
class Area
{
    float num1,num2,area;
    public:void areaofsquare()
    {
        cout<<"Length of one side: \n";
        cin>>num1;
        cout<<"Length of the other side: \n";
        cin>>num2;
        area=num1*num2;
        cout<<"Area of the square is: \n"<<area;
    }
};
int main()
{
    Area obj;
    obj.areaofsquare();
}
