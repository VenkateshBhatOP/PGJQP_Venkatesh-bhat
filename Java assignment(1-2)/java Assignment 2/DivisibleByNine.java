import java.util.Scanner;
class DivisibleByNine
{
int num;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
num=sc.nextInt();
if(num%9==0)
{
System.out.println("The number is divisible by nine");
}
else
{
System.out.println("The number is not divisible by nine");
}
}
public static void main(String...args)
{
DivisibleByNine obj=new DivisibleByNine();
obj.accept();
}
}