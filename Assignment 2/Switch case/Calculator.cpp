#include<iostream>
using namespace std;
class calculator

{
int choice;
long num1, num2,x;
public:void accept()
{
   cout << "Please choose your option:\n"
           "1 = Addition\n"
           "2 = Subtraction\n"
           "3 = Multiplication\n"
           "4 = Division\n"
           "5 = Squares\n"
           "6 = exit"
           "\n\nChoice: ";
   cin >> choice;
   if(choice < 1 || choice > 6)
   {
      cout << "\nPlease choose the above mentioned option."
              "\nChoice: ";
      cin >> choice;
   }

   switch (choice)
   {
      case 1:
         cout << "Enter two numbers: \n";
         cin >> num1 >> num2;
         x = num1 + num2;
         cout << "Sum = " << x;
         break;

      case 2:
         cout << "Enter two numbers: \n";
         cin >> num1 >> num2;
         x = num1 - num2;
         cout << "Subtraction = " << x;
         break;

      case 3:
         cout << "Enter two numbers: \n";
         cin >> num1 >> num2;
         x = num1 * num2;
         cout << "Product = " << x;
         break;

      case 4:
         cout << "Enter Dividend: ";
         cin >> num1;
         cout << "Enter Divisor: ";
         cin >> num2;

         if(num2 == 0)
         {
            cout << "\nDivisor cannot be zero."
                    "\nEnter divisor once again: ";
            cin >> num2;
         }
         x = num1 / num2;
         cout << "\nQuotient = " << x;
         break;

      case 5:
         cout << "Enter any number: \n";
         cin >> num1;
         x = num1 * num1;
         cout << "Square = " << x;
         break;

      default: cout << "\nError";
   }


   }
};
int main()
{
    calculator obj;
    obj.accept();
}
