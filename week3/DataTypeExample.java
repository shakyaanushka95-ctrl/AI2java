package week3;

/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[]arg)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
         
        int length=10;
        int breadth=20;
        
        int p=(int)2*(length+breadth);
        System.out.println("The perimeter is"+p);
        
        int principle=500;
        int time=2;
        float rate=2.4f;
        
        int SI=(int)(principle*time*rate/1000);
        System.out.println("The SI is"+SI);
    
    }
    

}