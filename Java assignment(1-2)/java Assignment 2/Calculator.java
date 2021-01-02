import java.util.Scanner;
public class Calculator 
{
public double num1,num2,addition,multiplication,division,subtraction;

public void getData()
{
Scanner sc=new Scanner(System.in);
System.out.println("---------Menu---------\n");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
System.out.println("Choose option :");
int option=sc.nextInt();
switch(option)
{
case 1: add();
break;
case 2: sub();
break;
case 3: mul();
break;
case 4: div();
break;
default: System.out.println("Enter a valid option");
getData();
}
}

void add()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers: ");
num1=sc.nextDouble();
num2=sc.nextDouble();
addition=num1+num2;
System.out.println(addition);
}
void sub()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers: ");
num1=sc.nextDouble();
num2=sc.nextDouble();
subtraction=num1-num2;
System.out.println(subtraction);
}
void mul()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers: ");
num1=sc.nextDouble();
num2=sc.nextDouble();
multiplication=num1*num2;
System.out.println(multiplication);
}
void div()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers: ");
num1=sc.nextDouble();
num2=sc.nextDouble();
division=num1/num2;
System.out.println(division);
}


public static void main(String...args)
{
Calculator obj=new Calculator();
obj.getData();
}
}