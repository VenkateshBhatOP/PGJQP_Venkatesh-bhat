import java.util.Scanner;
public class NumOfDigits
{
public int num, count=0;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
num=sc.nextInt();

while(num!=0)
{
num/=10;
count++;
}
System.out.println("The number of digits in the number is: "+count);
}

public static void main(String...args)
{
NumOfDigits obj=new NumOfDigits();
obj.accept();
}
}