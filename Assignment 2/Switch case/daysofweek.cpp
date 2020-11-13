#include<iostream>
using namespace std;
class Name
{
    int choice;
    public:void display()
    {
        cout<<"Enter which day you want to display:";
        cin>>choice;
        switch(choice)
        {
            case 1:cout<<"First day of the week is Monday";break;
            case 2:cout<<"Second day of the week is Tuesday";break;
            case 3:cout<<"Third day of the week is Wednesday";break;
            case 4:cout<<"Fourth day of the week is Thursday";break;
            case 5:cout<<"Fifth ay of the week is Friday";break;
            case 6:cout<<"Sixth day of the week is Saturday";break;
            case 7:cout<<"Seventh day of the week is Sunday";break;
            default:cout<<"Invalid input";
        }
    }
};
int main()
{
    Name obj;
    obj.display();
}
