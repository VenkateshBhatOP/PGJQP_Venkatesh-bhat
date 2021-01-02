import java.util.*;
class Upper_Lower
{
char alpha;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character: ");
alpha=sc.next().charAt(0);
if(alpha>=65 && alpha<=90)
{
System.out.println("The entered character is an uppercase alphabet");
}
else if(alpha>=97 && alpha<=122)
{
System.out.println("The entered character is a lowercase alphabet");
}
else
{
System.out.println("Please enter an Alphabet");
}
}
public static void main(String...args)
{
Upper_Lower obj=new Upper_Lower();
obj.accept();
}
}

