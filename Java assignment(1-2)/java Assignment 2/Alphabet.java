import java.util.*;
class Alphabet
{
char alpha;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character: ");
alpha=sc.next().charAt(0);
if(alpha>='A' && alpha<='Z' || alpha>='a' && alpha<='z')
{
System.out.println("The Entered character is an Alphabet");
}
else
{
System.out.println("The Entered character is not an Alphabet");
}
}
public static void main(String...args)
{
Alphabet obj=new Alphabet();
obj.accept();
}
}
