import java.util.Scanner;
class Inequality
{
int num1,num2;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two integers :");
num1=sc.nextInt();
num2=sc.nextInt();
if(num1!=num2)
{
System.out.println("The two integers aren't equal");
}
else
{
System.out.println("The two integers are equal");

}
}
public static void main(String...args)
{
Inequality obj=new Inequality();
obj.accept();
}
}