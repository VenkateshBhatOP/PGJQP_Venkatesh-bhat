#include<iostream>
using namespace std;
class Even_Numbers
{
    int num;
    public :void display()
    {
cout<<"The first 10 even numbers are:\n";
    for(num=1;num<=10;num++)

    cout<<num*2<<endl;



    }
};
int main()
{
    Even_Numbers obj;
    obj.display();
}
