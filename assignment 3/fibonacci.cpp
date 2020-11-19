#include <iostream>
using namespace std;
class Series

{
    int n, a = 0, b = 1, c = 0;
    public:void display()
    {

    cout << "Enter the number of terms: ";
    cin >> n;

    cout << "Fibonacci Series: ";

    for (int i = 1; i <= n; i++)
    {
        if(i == 1)
        {
            cout << " " << a;
            continue;
        }
        if(i == 2)
        {
            cout << b << " ";
            continue;
        }
        c = a + b;
        a = b;
        b = c;

        cout << c << " ";
    }

    }
};
int main()
{
    Series obj;
    obj.display();
}
