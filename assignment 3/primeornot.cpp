#include <iostream>
using namespace std;
class PrimeNum{
   int num;
   bool flag = true;
   public:void display()
   {


   cout<<"Enter any number(positive): ";
   cin>>num;

   for(int i = 2; i <= num / 2; i++) {
      if(num % i == 0) {
         flag = false;
         break;
      }
   }
   if (flag==true)
      cout<<num<<" is a prime number";
   else
      cout<<num<<" is not a prime number";
   }

};
int main()
{
    PrimeNum obj;
    obj.display();
}
