import java.util.Scanner;
class Pos_Neg_Zero
{
int num;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
num=sc.nextInt();
if(num>0)
{
System.out.println("The number is positive");
}
else if(num<0)
{
System.out.println("The number is negative");
}
else
{
System.out.println("The number is zero");
}
}
public static void main(String...args)
{
Pos_Neg_Zero obj=new Pos_Neg_Zero();
obj.getData();
}
}

