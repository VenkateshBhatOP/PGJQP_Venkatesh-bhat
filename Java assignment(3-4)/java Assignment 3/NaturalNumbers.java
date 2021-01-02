import java.util.Scanner;
public class NaturalNumbers
{
int arr[]=new int[10];
public int sum=0;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first 10 natural numbers: ");
for (int i=1;i<=10;++i)
{
sum=sum+i;
}
System.out.println("Sum is "+sum);

}
public static void main(String...args)
{
NaturalNumbers obj=new NaturalNumbers();
obj.accept();
}
}