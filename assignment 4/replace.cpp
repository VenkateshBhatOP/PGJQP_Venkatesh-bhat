#include <bits/stdc++.h>
using namespace std;


int main()
{
    int arr[] = { 5,20,15,20,25,30 };
    int n = sizeof(arr) / sizeof(arr[0]);


    int old_val = 15, new_val = 77;


    cout << "Original Array:";
    for (int i = 0; i < n; i++)
        cout << ' ' << arr[i];
    cout << '\n';


    replace(arr, arr + n, old_val, new_val);


    cout << "New Array:";
    for (int i = 0; i < n; i++)
        cout << ' ' << arr[i];
    cout << '\n';

    return 0;
}
