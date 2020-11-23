#include<iostream>
using namespace std;

class Max_Min
{
	int Arr[100],n,temp,i,j;
	public:void display()
	{

	cout<<"Enter number of elements you want to insert: ";
	cin>>n;

	for(i=0;i<n;i++)
	{
		cout<<"Enter element "<<i+1<<":";
		cin>>Arr[i];
	}

	for(i=0,j=n-1;i<n/2;i++,j--)
	{
		temp=Arr[i];
		Arr[i]=Arr[j];
		Arr[j]=temp;
	}

	cout<<"\nReverse array"<<endl;

	for(i=0;i<n;i++)
		cout<<Arr[i]<<" ";

	}
};
int main()
{
    Max_Min obj;
    obj.display();
}
