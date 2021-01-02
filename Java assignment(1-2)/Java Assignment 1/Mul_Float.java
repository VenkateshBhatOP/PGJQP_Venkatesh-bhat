import java.util.Scanner;
class Mul_Float
{
float num1,num2,mul;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter two floating point numbers: ");
num1=sc.nextFloat();
num2=sc.nextFloat();
}
void display()
{
mul=(num1*num2);
System.out.println("The multiplication of two numbers is: "+mul);
}
public static void main(String...args)
{
Mul_Float obj=new Mul_Float();
obj.accept();
obj.display();
}
}

