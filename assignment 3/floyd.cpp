#include <iostream>
using namespace std;

class Floyd_Num
{
    int rows, num = 1;
    public:void display()
    {
    cout << "Enter number of rows: ";
    cin >> rows;


    for(int i = 1; i <= rows; i++)
    {
      for(int j = 1; j <= i; j++)
        {
            cout << num << " ";
            num++;
        }
            cout << endl;
    }


}
};
int main()
{
    Floyd_Num obj;
    obj.display();
}
