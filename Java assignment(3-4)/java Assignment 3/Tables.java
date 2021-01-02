import java.util.Scanner;
public class Tables
{
public int num;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
num=sc.nextInt();
int i=1;
while (i<=10)
{
System.out.println(num+" * "+i+" = "+(num*i));
i++;
}
}

public static void main(String...args)
{
Tables obj=new Tables();
obj.accept();
}
}