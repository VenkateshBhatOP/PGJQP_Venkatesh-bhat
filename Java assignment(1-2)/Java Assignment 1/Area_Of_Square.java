import java.util.Scanner;
class Area_Of_Square
{
float side1,side2,area;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of side a: ");
side1=sc.nextFloat();
System.out.println("Enter the length of side b: ");
side2=sc.nextFloat();
}
void display()
{
area=(side1*side2);
System.out.println("The area of the square is: "+area);
}
public static void main(String...args)
{
Area_Of_Square obj=new Area_Of_Square();
obj.getdata();
obj.display();
}
}

