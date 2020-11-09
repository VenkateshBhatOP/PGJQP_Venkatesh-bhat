#include<iostream>
using namespace std;
    class Integer
    {
        int num;
        public :void number()
        {
            cout<<"Enter the number: \n";
            cin>>num;
            cout<<"The entered number is:"<<num;

        }
    };
    int main()
    {
        Integer obj;
        obj.number();
    }
