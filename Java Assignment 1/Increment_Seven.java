import java.util.Scanner;
class Increment_Seven
{
int num;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
num=sc.nextInt();
System.out.print("The number after the increment will be: "+(num+7));
}
public static void main(String...args)
{
Increment_Seven obj=new Increment_Seven();
obj.accept();
}
}