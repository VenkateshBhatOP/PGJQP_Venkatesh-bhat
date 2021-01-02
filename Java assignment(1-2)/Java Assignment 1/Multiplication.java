import java.util.Scanner;
class Multiplication
{
int num1,num2,num3,product;
void mul()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter three numbers: ");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();

}
void display()
{
product=(num1*num2*num3);
System.out.print("The product of the three numbers is: "+product);
}
public static void main(String[] args)
{
Multiplication obj=new Multiplication();
obj.mul();
obj.display();
}
}
