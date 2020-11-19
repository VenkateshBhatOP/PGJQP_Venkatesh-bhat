#include <iostream>
using namespace std;
class Armstrong
{
int n,Num,remainder,result = 0;
    public:void accept()
    {


    cout << "Enter a three-digit integer: ";
    cin >> n;
    Num = n;

    while (Num != 0) {

        remainder = Num % 10;

        result += remainder * remainder * remainder;
        Num /= 10;
    }

    if (result == n)
        cout << n<< " is an Armstrong number.";
    else
        cout << n << " is not an Armstrong number.";
    }
};
int main()
{
    Armstrong obj;
    obj.accept();
}
