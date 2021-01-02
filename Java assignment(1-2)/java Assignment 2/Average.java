import java.util.Scanner;
class Average
{
int n1,n2,n3,n4,n5,avg;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the five numbers: ");
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
n4=sc.nextInt();
n5=sc.nextInt();

}
void display()
{
avg=((n1+n2+n3+n4+n5)/5);
System.out.println("The average of five numbers is: "+avg);
if(avg>10)
{
System.out.println("The average is greater than 10");
}
else
{
System.out.println("The average is less than 10");
}
}
public static void main(String...args)
{
Average obj=new Average();
obj.accept();
obj.display();
}
}
