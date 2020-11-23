#include<iostream>

using namespace std;
int multiply(int a[], int n)
{

    if (n == 0)
        return(a[n]);
    else
        return (a[n] * multiply(a, n - 1));
}


int main()
{
    int array[] = {1, 2, 3, 4, 5, 6};
    int n = sizeof(array) / sizeof(array[0]);
    cout << multiply(array, n - 1)
         << endl;
    return 0;
}
