#include<iostream>
using namespace std;
class Area
{

    float r;
    float a;
    public:void areaOfcircle()
    {
        cout<<"enter the radius of circle: \n";
        cin>>r;
        a=3.14*(r*r);
        cout<<"the area of circle is: \n"<<a;
    }
};
int main()
{
    Area obj;
    obj.areaOfcircle();
}
