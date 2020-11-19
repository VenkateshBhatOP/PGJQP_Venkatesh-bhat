#include <iostream>
using namespace std;

class Tables
{
    int n;
    public:void display()
    {
    cout << "Enter an integer: ";
    cin >> n;

    for (int i = 1; i <= 10; ++i) {
        cout << n << " * " << i << " = " << n * i << endl;
    }
    }
};
int main()
{
    Tables obj;
    obj.display();
}

