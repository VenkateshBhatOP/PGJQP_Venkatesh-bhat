#include<iostream>
using namespace std;
class Reverse
{
    int rev=0,rem,num,n;
    public: void display_reverse()
    {
     cout<<"Enter a number:";
     cin>>num;
     n=num;
     while(num>0)
     {
      rem=num%10;
      rev=rev*10+rem;
      num=num/10;
     }
     cout<<"Reverse : "<<rev<<endl;
    if
   (n==rev)
   {
       cout<<"The number is a palindrome";
   }
   else
   {
       cout<<"The number is not a palindrome";
   }
    }
};
int main()
{
    Reverse r1;
    r1.display_reverse();
}

