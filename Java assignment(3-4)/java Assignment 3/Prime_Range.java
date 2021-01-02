import java.util.Scanner;
class Prime_Range
{
int num1,num2;
void display()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the lower bound");
num1=sc.nextInt();
System.out.println("Enter the upper bound");
num2=sc.nextInt();
int low=num1;
int high=num2;
while (low < high) 
{
   boolean flag = false;
   for(int i = 2; i <= low/2; ++i)
 {
                
   if(low % i == 0) 
{
         flag = true;
         break;
 }
   }

    if (!flag && low != 0 && low != 1)
    System.out.println(low + " ");

            ++low;
        }
    }
public static void main(String...args)
{
Prime_Range obj=new Prime_Range();
obj.display();
}
}