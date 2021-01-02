import java.util.Scanner;
class Area_Perimeter_Rectangle
{
float num1,num2,area,perimeter;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the Rectangle: ");
num1=sc.nextFloat();
System.out.println("Enter the breadth of the Rectangle: ");
num2=sc.nextFloat();
}
void display()
{
area=(num1*num2);
perimeter=(2*(num1+num2));
System.out.println("The Area of the Rectangle is: "+area);
System.out.println("The Perimeter of the Rectangle is: "+perimeter);
}
public static void main(String...args)
{
Area_Perimeter_Rectangle obj=new Area_Perimeter_Rectangle();
obj.getdata();
obj.display();
}
}