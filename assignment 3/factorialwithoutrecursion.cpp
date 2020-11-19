#include <iostream>
#include <stdlib.h>
#include <stdio.h>
using namespace std;
class Factorial
{
    int fact,i;

    int n;
    public:void display()
    {

    cout << "Enter value of N:" ;
    cin >> n;

    fact = 1;

    i = 1;

    while(i<=n)
    {

        fact = fact * i;

        i++;

    }

    cout << "Factorial of N:" << fact << endl;

    }
};
int main()
{
    Factorial obj;
    obj.display();
}

