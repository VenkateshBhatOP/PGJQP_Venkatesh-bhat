import java.util.Scanner;
class Swap
{
int num1,num2,temp;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers: ");
num1=sc.nextInt();
num2=sc.nextInt();
temp=num1;
num1=num2;
num2=temp;
System.out.println("The numbers after getting Swapped will be: \n"+num1);
System.out.println(+num2);
}
public static void main(String...args)
{
Swap obj=new Swap();
obj.getData();
}
}