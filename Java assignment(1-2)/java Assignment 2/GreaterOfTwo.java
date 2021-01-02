import java.util.Scanner;
class GreaterOfTwo
{
int num1,num2;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
num1=sc.nextInt();
num2=sc.nextInt();
if(num1>num2)
{
System.out.println("First number is greater");
}
else
{
System.out.println("Second number is greater");
}
}
public static void main(String...args)
{
GreaterOfTwo obj=new GreaterOfTwo();
obj.getData();
}
}