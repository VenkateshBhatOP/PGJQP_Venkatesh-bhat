import java.util.Scanner;
class Prime
{
int num;
boolean flag= false;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
num=sc.nextInt();
for(int i=2;i<=num/2;i++)
if(num%2==0)
{
flag=true;
break;
}
if(!flag)
{
System.out.println(num+ " is a prime number");
}
else
{
System.out.println(num+ " is not a prime number");
}
}
public static void main(String...args)
{
Prime obj=new Prime();
obj.accept();
}
} 