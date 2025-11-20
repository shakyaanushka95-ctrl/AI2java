import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstNumber");
        int firstNumber=sc.nextInt();
        
        System.out.println("Enter the secondNumber");
        int secondNumber=sc.nextInt();
        
        int sum=firstNumber+secondNumber;
        System.out.println("sum is:"+sum);
        int difference=firstNumber-secondNumber;
        System.out.println("difference is:"+difference);
        int multiplication=firstNumber*secondNumber;
        System.out.println("multiplication is:"+multiplication);
        int division=firstNumber/secondNumber;
        System.out.println("division is:"+division);
        
        
    
    
    }
    
    }
