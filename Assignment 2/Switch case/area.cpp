#include<iostream>
using namespace std;
class Area
{
    int choice;
    float num1,num2,area;
    public:void accept()
    {
        cout<<"Choose a polygon to determine its area:\n"
        "1. Square\n"
        "2. Rectangle\n"
        "3. Triangle\n"
        "4. Exit"
        "\n\nChoice=";
        cin>>choice;

        while(choice<1||choice>4)
        {
        cout<<"Please enter a valid choice"
            "\n\nChoice=";
        cin>>choice;
        }

        switch(choice)
        {
        case 1:
            cout<<"Enter the length of any two sides of a Square:";
            cin>>num1>>num2;
            area=num1*num2;
            cout<<"The area of Square is: "<<area;
            break;

        case 2:
            cout<<"Enter the length and the width of a Rectangle:";
            cin>>num1>>num2;
            area=num1*num2;
            cout<<"The area of Rectangle is: "<<area;
            break;

        case 3:

            cout<<"Enter the length of base of a Triangle:";
            cin>>num1;
            cout<<"Enter the height of a triangle:";
            cin>>num2;
            area=(0.5*num1*num2);
            cout<<"The area of Triangle is:"<<area;
            break;

        default:cout<<"error";


        }


    }
};
int main()
{
    Area obj;
    obj.accept();
}

