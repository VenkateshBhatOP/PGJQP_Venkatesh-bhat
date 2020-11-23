#include<iostream>
#include<conio.h>
using namespace std;
class Static_Ex
{
    void accept()
    {
        static int num=1;
        cout<<num<<endl;
        num++;
    }
    int num;
    public: void display()
    {

        cout<<"Number of likes:";

        accept();
        system("pause");



    }

};

int main()

{
    int i;
    for (i=0;i<=1000000;i++)
    {
        Static_Ex obj;
        obj.display();
    }
}

