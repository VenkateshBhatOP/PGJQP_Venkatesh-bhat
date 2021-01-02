import java.util.Scanner;
class Pass_Fail
{
int marks;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks of the student :");
marks=sc.nextInt();
}
void display()
{
if(marks>=90)
{
System.out.println("The student has passed with Grade A");
}
else if(marks>=80 && marks<90)
{
System.out.println("The student has passed with Grade B");
}
else if(marks>=60 && marks<80)
{
System.out.println("The student has passed with Grade C");
}
else if(marks>=45 && marks<60)
{
System.out.println("The student has passed with Grade D");
}
else
{
System.out.println("The student has failed");
}
}
public static void main(String...args)
{
Pass_Fail obj=new Pass_Fail();
obj.accept();
obj.display();
}
}