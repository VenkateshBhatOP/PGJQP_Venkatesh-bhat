import java.util.Scanner;
class DivisibleBySeven
{
int num;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
num=sc.nextInt();
if(num%7==0)
{
System.out.println("The number is divisible by seven");
}
else
{
System.out.println("The number is not divisible by seven");
}
}
public static void main(String...args)
{
DivisibleBySeven obj=new DivisibleBySeven();
obj.accept();
}
}