#include <iostream>
using namespace std;
class SumEx
{
int n,sum=0,m;
public:void display()
{


cout<<"Enter a number: "; //35
cin>>n;
while(n>0)           //35>0//3>0//0!>0
{
m=n%10;          //m=5//m=3
sum=sum+m;        //sum=5//8
n=n/10;            //n=3//n=0
}
cout<<"Sum is= "<<sum<<endl;

}

};
int main()
{
    SumEx obj;
    obj.display();
}
