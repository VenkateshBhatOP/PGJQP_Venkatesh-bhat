#include<iostream>
using namespace std;
class Numbers
{
    int i=1;
    public:void display()
    {
        cout<<"The first 100 odd numbers are:\n";
        for(;i<=100;i++)
            if(i%2!=0)
        {


            cout<<i<<endl;
        }




    }
};
int main()
{
    Numbers obj;
    obj.display();
}
