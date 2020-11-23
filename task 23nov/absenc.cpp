#include<iostream>
using namespace std;
class Bike
{
    float length=2.16;
    float width=0.79;
    float height=1.09;
    float wheelBase=1.37;
    float groundClearance=0.135;
    float seatHeight=0.8;
    char clutch[20]="Wet, Multi-plate";
    float fDisc=0.28;
    float rDisc=0.24;
private
    :void hide()
    {
        cout<<"Length: "<<length<<"m"<<"\t\t\t\t\t\t\t\t\t";
        cout<<"Width: "<<width<<"m"<<endl;
        cout<<"Height: "<<height<<"m"<<"\t\t\t\t\t\t\t\t\t";
        cout<<"Wheel Base: "<<wheelBase<<"m"<<endl;
        cout<<"Ground Clearance: "<<groundClearance<<"m"<<"\t\t\t\t\t\t\t";
        cout<<"Seat Height: "<<seatHeight<<"m"<<endl;
        cout<<"Clutch type: "<<clutch<<"\t\t\t\t\t\t\t";
        cout<<"Front Disc Size: "<<fDisc<<"m"<<endl;
        cout<<"Rear Disc Size: "<<rDisc<<"m"<<"\t\t\t\t\t\t\t\t\n\n";
    };
    float tank=13.5;
    int mileage=37;
    char standard[10]="BSVI";
    int gear=5;
    char fBrake[5]="Disc";
    char rBrake[5]="Disc";
    char start[20]="Kick, Self";
    char fuelDelivery[30]="Electric Fuel Injection";
    public:void display()
    {
        cout<<"\t\t\t\t------------Royal Enfield Classic 350------------"<<"\n\n";
        cout<<"Fuel Tank Capacity: "<<tank<<"L"<<"\t\t\t\t\t\t\t";
        cout<<"Mileage: "<<mileage<<"kmph"<<endl;
        cout<<"Emission Standard: "<<standard<<"\t\t\t\t\t\t\t\t";
        cout<<"Gears: "<<gear<<endl;
        cout<<"Front Brake: "<<fBrake<<"\t\t\t\t\t\t\t\t";
        cout<<"Rear Brake: "<<rBrake<<endl;
        cout<<"Starting Method: "<<start<<"\t\t\t\t\t\t\t";
        cout<<"Fuel Delivery: "<<fuelDelivery<<endl;
        cout<<"\t\t\t\t\t More(...\n\n\n\n";
        system("pause");
        hide();
    }
};
int main()
{
    Bike obj;
    obj.display();

}

