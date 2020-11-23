#include <iostream>
using namespace std;
class Multiple
{
    int arr[5],i;
    public:void display()
    {
        cout<<"Enter five numbers:";
        for(i=0;i<=4;i++)
        cin>>arr[i];
        cout<<"The multiple of 2 of the entered digits are:";
        for(i=0;i<=4;i++)
        cout<<(arr[i]*2)<<endl;

    }
};
int main()
{
    Multiple obj;
    obj.display();
}
