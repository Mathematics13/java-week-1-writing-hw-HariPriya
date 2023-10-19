package homework_week_5;

/**
 * Program 9
 * Write a Java Program to print the result of the following operations
 * Test Data:
 * a) -5 + 8 * 6
 * b) (55+9) % 9
 * c) 20 + -3*5 /8
 * d) 5+15 / 3 * 2 - 8 % 3
 * Expected Output: 43
 * 1
 * 19
 * 13
 */
public class Program_9_MixedOperations
{
    public static void main(String[] args)
    {
        int a = -5 + 8 * 6;         //Mixed Operation declaration
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a);     //Output
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
