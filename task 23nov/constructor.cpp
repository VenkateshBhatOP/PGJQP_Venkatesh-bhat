#include<iostream>
using namespace std;

class Square
{
    public:
    int side;
    int area;
    Square()
    {
        side=10;
        area=side*side;
    }
};

int main()
{
    Square c;
    cout <<"Side:"<<c.side<<endl;
    cout<<"Area:"<<c.area;
}

