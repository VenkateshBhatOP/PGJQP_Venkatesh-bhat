import java.util.*;
class Swap_One
{

int num1,num2;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers: ");
num1=sc.nextInt();
num2=sc.nextInt();
}
void swap()
{
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("The numbers after swapping will be: "+num1);
System.out.println(+num2);
}
public static void main(String...args)
{
Swap_One obj=new Swap_One();
obj.getData();
obj.swap();
}
}