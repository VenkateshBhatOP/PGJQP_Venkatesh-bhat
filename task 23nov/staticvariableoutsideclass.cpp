#include<iostream>
using namespace std;
class Static_Ex
{
    static int num;
    public:void accept()

    {

     cout<<"The increment of the number is:"<<num++<<endl;


    }
};
    int Static_Ex::num=1;

    int main()
    {

            Static_Ex obj1,obj2;
            obj1.accept();
            obj2.accept();
    }

