
#include<iostream>
using namespace std;
int mul(int,int);
float mul(float,int);


int mul(int a,int b)
{
    return a*b;
}
float mul(double x, int y)
{
    return x*y;
}
int main()
{
    int num1= mul(6,7);
    float num2 = mul(0.2,3);
    cout << "num1 is : " <<num1<< endl;
    cout <<"num2 is : "  <<num2<< endl;
    return 0;
}
