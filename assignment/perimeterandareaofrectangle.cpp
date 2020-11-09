#include<iostream>
using namespace std;
class Rectangle
{
    float Area,Perimeter,length,width;
    public:void rec()
    {
        cout<<"Enter the length of rectangle in cm \n";
        cin>>length;
        cout<<"Enter the width of rectangle in cm \n";
        cin>>width;
        Area=length*width;
        Perimeter=2*(length+width);
        cout<<"Area of rectangle is \n"<<Area;
        cout<<" \nPerimeter of rectangle is\n "<<Perimeter;
    }

};
int main()
{
    Rectangle obj;
    obj.rec();
}

