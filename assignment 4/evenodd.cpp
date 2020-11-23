#include <iostream>
#include <conio.h>
using namespace std;
class Even_Odd
{

    int arr[100];
    int i,size,odd=0,even=0;
        public:void accept()
        {

    cout<<"Enter size of the array\n";
    cin>>size;
    cout<<"\nEnter elements of the array\n\n";
    for(i=0; i<size; i++)
    {
        cout<<"Enter the element arr["<<i<<"] :";
        cin>>arr[i];
    }
    for(i=0; i<size; i++)
    {
        if(arr[i]%2==0)
        {
            even++;
        }
        else{
            odd++;
        }
    }
    cout<<"\nTotal even numbers of an array :"<<even<<"\n";
    cout<<"Total odd numbers of an array : "<<odd;
     getch();
}

};
int main()
{
    Even_Odd obj;
    obj.accept();
}

