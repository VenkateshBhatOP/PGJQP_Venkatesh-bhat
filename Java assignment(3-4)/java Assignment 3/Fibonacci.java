import java.util.Scanner;
class Fibonacci
{
int num1=0,num2=1,num3,count=10;
void accept()
{
System.out.print("The Fibonacci series is: \n"+num1+ " "+num2);
for(int i=2;i<=count;i++)
{
num3=num1+num2;
System.out.print(" "+num3);

num1=num2;
num2=num3;
}
}
public static void main(String...args)
{
Fibonacci obj=new Fibonacci();
obj.accept();
}
}