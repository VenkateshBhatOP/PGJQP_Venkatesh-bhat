import java.util.Scanner;
class Add_Mul
{
float num1,num2,add,mul;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers: ");
num1=sc.nextFloat();
num2=sc.nextFloat();
}
void display()
{
add=num1+num2;
mul=num1*num2;
if(add>mul)
{
System.out.println("Addition of the two values is the greatest");
}
else
{
System.out.println("Multiplication of the two values is the greatest");
}
}
public static void main(String[] args)
{
Add_Mul obj=new Add_Mul();
obj.accept();
obj.display();
}
}