import java.util.Scanner;
class Int_Char_Float
{
int num;
String name;
float salary;
void accept()
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter a number: ");
num=sc.nextInt();
System.out.print("Enter a name: ");
name=sc.next();
System.out.print("Enter the salary: ");
salary=sc.nextFloat();
}

public static void main(String[] args)
{
Int_Char_Float obj=new Int_Char_Float();
obj.accept();
}
}


 