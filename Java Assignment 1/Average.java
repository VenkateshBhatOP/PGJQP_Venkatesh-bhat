import java.util.*;
class Average
{
int num1,num2,num3,num4,num5,avg;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter five numbers: ");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
num4=sc.nextInt();
num5=sc.nextInt();
}
void display()
{
avg=((num1+num2+num3+num4+num5)/5);
System.out.println("The average of five numbers is: "+avg);
}
public static void main(String...args)
{
Average obj=new Average();
obj.accept();
obj.display();
}
}