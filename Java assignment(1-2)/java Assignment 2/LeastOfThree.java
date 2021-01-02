import java.util.Scanner;
class LeastOfThree
{
int num1,num2,num3;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three numbers");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
}

void display()
{
if(num1<num2 && num1<num3 )
{
System.out.println("First number is the least");
}
else if(num2<num1 && num2<num3)
{
System.out.println("Second number is the least");
}
else
{
System.out.println("Third number is the least");
}
}
public static void main(String...args)
{
LeastOfThree obj=new LeastOfThree();
obj.getData();
obj.display();
}
}