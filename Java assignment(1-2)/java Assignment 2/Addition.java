import java.util.Scanner;
class Addition
{
 float n1,n2,add;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers to be added: ");
n1=sc.nextFloat();
n2=sc.nextFloat();
}
void display()
{
add=n1+n2;
System.out.println("The Addition of the two numbers is: "+add);
if(add>100)
{
System.out.println("The result of the addition is greater than 100");
}
else
{
System.out.println("The result is less than 100");
}
}
public static void main(String...args)
{
Addition obj=new Addition();
obj.accept();
obj.display();
}
}