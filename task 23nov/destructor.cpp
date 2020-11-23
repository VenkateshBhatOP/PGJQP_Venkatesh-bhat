#include <iostream>
using namespace std;
class Hi
{
public:

  Hi()
  {
    cout<<"Constructor is called"<<endl;
  }

  ~Hi()
  {
    cout<<"Destructor is called"<<endl;
   }

   void display()
   {
     cout<<"Hi"<<endl;
   }
};
int main(){

   Hi obj;
   obj.display();
   return 0;
}
