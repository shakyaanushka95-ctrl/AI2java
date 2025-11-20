import java.util.Scanner;

/**
 * Write a description of class MathOperator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperator
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your firstNumeric grade");
        int firstNumeric=sc.nextInt();
         
        System.out.println("Enter your secondNumeric grade");
        int secondNumeric=sc.nextInt();
        
        int sum=firstNumeric+secondNumeric;
       
        int difference=firstNumeric-secondNumeric;
       
        int multiplication=firstNumeric*secondNumeric;
        System.out.print("the sum is"+sum +"\n"+"the difference"+difference+"\n");
    }

         
    

}
