import java.util.Scanner;
public class PalindromeNumber 
{

    public static void main(String[] args) {

        int num, reverse = 0, remainder, temp;
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
num=sc.nextInt();
        temp = num;

        
        while( num != 0 )
        {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num  /= 10;
        }

        
        if (temp == reverse)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }
}
}
