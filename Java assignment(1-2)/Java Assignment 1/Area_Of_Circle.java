import java.util.*;
class Area_Of_Circle
{
float radius;
double pi=3.14,area;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of the circle: ");
radius=sc.nextFloat();
}
void display()
{
area=pi*radius*radius;
System.out.println("The area of the circle is: "+area);
}
public static void main(String...args)
{
Area_Of_Circle obj=new Area_Of_Circle();
obj.getdata();
obj.display();
}
}