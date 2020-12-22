import java.util.Scanner;
class Increment_One
{
int num;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
num=sc.nextInt();
System.out.print("The number after the increment will be: "+(num+1));
}
public static void main(String...args)
{
Increment_One obj=new Increment_One();
obj.accept();
}
}