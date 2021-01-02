import java.util.Scanner;
class GreaterOfThree
{
int num1,num2,num3;
void getData()
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the three positive integers: ");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
if(num1>num2 && num1>num3)
{
System.out.println("First number is the greatest");
}
else if(num2>num1 &&num2>num3)
{
System.out.println("Second number is the greatest");
}
else
{
System.out.println("Third number is the greatest");
}
}
public static void main(String...args)
{
GreaterOfThree obj=new GreaterOfThree();
obj.getData();
}
}