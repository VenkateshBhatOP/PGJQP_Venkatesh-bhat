#include<iostream>
using namespace std;
class Max_Min
{
    int arr[10],max,min,n,i;
    public:void accept()
    {
        cout<<"Number of elements in the array: ";
        cin>>n;
        cout<<"Elements in the array: ";
        for(i=0;i<n;i++)
            cin>>arr[i];
        max=arr[0];
        for(i=0;i<n;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        min=arr[0];
        for(i=0;i<n;i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
        cout<<"Max value: "<<max<<endl;
        cout<<"Min value: "<<min<<endl;
    }
};
int main()
{
    Max_Min obj;
    obj.accept();
}
