import java.util.Scanner;
public class Area
{
float num1,num2,areaoftria,areaofrect,areaofsqua;
int option;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("---------Menu---------");
System.out.println("1. Area of a triangle");
System.out.println("2. Area of a Square ");
System.out.println("3. Area of a Rectangle");
System.out.println("Choose an option: ");
option=sc.nextInt();
switch(option)
{
case 1: tria();
break;
case 2: squa();
break;
case 3: rect();
break;
default: System.out.println("Enter a vaild option");
getData();
}
}
void tria()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base");
num1=sc.nextFloat();
System.out.println("Enter the height");
num2=sc.nextFloat();
areaoftria=0.5f*num1*num2;
System.out.println("Area of triangle is "+areaoftria);
}
void squa()
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of one side: ");
num1=sc.nextFloat();
System.out.println("Enter the length of the other side: ");
num2=sc.nextFloat();
areaofsqua=num1*num2;
System.out.println("Area of Square is "+areaofsqua);
}
void rect()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length: ");
num1=sc.nextFloat();
System.out.println("Enter the breadth: ");
num2=sc.nextFloat();
areaofrect=num1*num2;
System.out.println("Area of Rectangle is "+areaofrect);
}

public static void main(String...args)
{
Area obj=new Area();
obj.getData();
}
}












