import java.util.Scanner;
class Addition
{
int num1,num2,sum;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers: ");
num1=sc.nextInt();
num2=sc.nextInt();
sum=num1+num2;
System.out.print("The sum is: "+sum);
}
public static void main(String...args)
{
Addition obj=new Addition();
obj.getdata();
}
}