#include <iostream>
using namespace std;
class Number
{

int num, temp;
int count = 0;
public :void accept()
{
        cout << "Enter any number : ";
    cin >> num;
    temp = num;

    while(temp != 0)
        {

        count++;
        temp /= 10;
    }

    cout << endl << "Total digits in " << num << " : "  << count;

}
};
int main()
{
    Number obj;
    obj.accept();
}
