#include<iostream>
using namespace std;
class Name
{
    int choice;
    public:void display()
    {
        cout<<"Enter which month you want to display:";
        cin>>choice;
        switch (choice)
        {
            case 1:cout<<"First month is January";break;
             case 2:cout<<"Second month is February";break;
              case 3:cout<<"Third month is March";break;
               case 4:cout<<"Fourth month is April";break;
                case 5:cout<<"Fifth month is May";break;
                 case 6:cout<<"Sixth month is June";break;
                  case 7:cout<<"Seventh month is July";break;
                   case 8:cout<<"Eighth month is August";break;
                    case 9:cout<<"Ninth month is September";break;
                     case 10:cout<<"Tenth month is October";break;
                      case 11:cout<<"Eleventh month is November";break;
                       case 12:cout<<"Twevelth month is December";break;
                       default:cout<<"Invalid input";
        }
    }
};
int main()
{
    Name obj;
    obj.display();
}
