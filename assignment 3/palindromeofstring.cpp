#include<iostream>
#include<string.h>
using namespace std;
class Reverse
{
    char str[20];

    char str1[20];
    int i,j,len=0,flag=0;


    public:void display()

    {
       cout<<"Enter a string to reverse:";
        gets(str);
        len=strlen(str)-1;
        for(i=len,j=0;i>=0;i--,j++)
            str1[j]=str[i];
        if(strcmp(str,str1))
            flag=1;
        if(flag==1)
            cout<<str<<" is not a palindrome";
        else
            cout<<str<<" is a palindrome";
    }
};
int main()
{
    Reverse obj;
    obj.display();
}

