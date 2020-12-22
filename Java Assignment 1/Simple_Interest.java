import java.util.*;
class Simple_Interest
{
float p,t,r,si;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Principal amount: ");
p=sc.nextFloat();
System.out.println("Enter the Time : ");
t=sc.nextFloat();
System.out.println("Enter  the rate: ");
r=sc.nextFloat();
}
void display()
{
si=((p*t*r)/100);
System.out.println("The Simple Interest is: "+si);
}
public static void main(String...args)
{
Simple_Interest obj=new Simple_Interest();
obj.getdata();
obj.display();
}
}