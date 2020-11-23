#include<iostream>
using namespace std;
class Difference
{
    int arr[10],i,n,positive=0,negative=0,zero=0;
    public :void accept()
    {
        cout<<"Enter the size of the array: ";
        cin>>n;
        cout<<"Enter the elements in the array: ";
        for(i=0;i<n;i++)
        {
            cin>>arr[i];
        }
    }

    void display()
    {
        for(i=0;i<n;i++)
            if(arr[i]>0)
            {
                cout<<"Positive values are: "<<positive<<endl;
                positive++;
            }
                else if(arr[i]<0)
                 {
                   cout<<"Negative values are: "<<negative<<endl;
                   negative++;
                 }
                    else
                     {
                       cout<<"Zero values are: "<<zero<<endl;
                       zero++;

                     }
                 }

            };

int main()
{
    Difference obj;
    obj.accept();
    obj.display();
}
