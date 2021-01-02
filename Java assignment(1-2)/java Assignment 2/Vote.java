import java.util.Scanner;
class Vote
{
int num1;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age : ");
num1=sc.nextInt();
if(num1>=18)
{
System.out.println("The person is eligible to vote");
}
else
{
System.out.println("The person is not eligible to vote");
}
}
public static void main(String...args)
{
Vote obj=new Vote();
obj.getData();
}
}
