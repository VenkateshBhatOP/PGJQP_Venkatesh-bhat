import java.util.Scanner;
class Quotient_Remainder
{
int num1,num2,quotient,remainder;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers: ");
num1=sc.nextInt();
num2=sc.nextInt();
quotient=(num1/num2);
remainder=(num1%num2);
}
void display()
{
System.out.println("The Quotient of the two numbers is: "+quotient);
System.out.print("The Remainder of the two numbers is: "+remainder);
}
public static void main(String...args)
{
Quotient_Remainder obj=new Quotient_Remainder();
obj.getdata();
obj.display();
}
}

