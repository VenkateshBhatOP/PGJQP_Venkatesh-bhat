import java.util.Scanner;
class Great_10
{
int num1;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a positive integer: ");
num1=sc.nextInt();
if(num1>10)
{
System.out.println("The number is greater than 10");
}
else
{
System.out.println("The number is less than 10");
}
}
public static void main(String...args)
{
Great_10 obj=new Great_10();
obj.getData();
}
}