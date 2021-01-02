import java.util.*;
class UpperToLower
{
char alpha;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Character : ");
alpha=sc.next().charAt(0);
if(alpha>=65 && alpha <=90)
{
int num=alpha;
num=num+32;
alpha=(char) num;
System.out.println("The entered Alphabet in lowercase will be :"+alpha);
}
else if(alpha>=97 && alpha<=122)
{
int num=alpha;
num=num-32;
alpha=(char) num;

System.out.println("The entered Alphabet in Uppercase will be :"+alpha);
}
else
{
System.out.println("Enter a valid character");
}
}
public static void main(String...args)
{
UpperToLower obj=new UpperToLower();
obj.accept();
}
}

