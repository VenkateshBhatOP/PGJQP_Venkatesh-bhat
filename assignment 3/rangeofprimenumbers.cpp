#include <iostream>
#include<math.h>
using namespace std;
class Range
{
    int num1,num2;
    int fnd=0,ctr=0;
    public :void display()
    {

	cout<<"Enter the range within which the prime numbers has to be displayed:\n";
	cin>>num1>>num2;
    cout << "The prime numbers between "<<num1<<" and "<<num2<<" are:"<<endl;
    for(int i=num1;i<=num2;i++)
       {
           for(int j=2;j<=sqrt(i);j++)
               {
               if(i%j==0)
                  ctr++;
               }
               if(ctr==0&&i!=1)
               { fnd++;
                 cout<<i<<" ";
                 ctr=0;
               }
               ctr=0;
       }
    }

};
int main()
{
    Range obj;
    obj.display();
}
