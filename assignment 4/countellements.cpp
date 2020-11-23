#include<iostream>
using namespace std;
class Elements
{

int array[10]={1,5,6,2,4,5,7,8,5};
    int n=0;
    int p;
    public :void accept()
    {
    while (p!= 0)
    {
                n++;
                p = array[n];

    }
    cout << "There are "<< n-1 << " elements in the array.";
    }
};
int main()
{
    Elements obj;
    obj.accept();
}
