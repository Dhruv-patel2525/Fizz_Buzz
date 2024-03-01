package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String FizzBuzz(int n)
    {
        return String.valueOf(n);
    }
    public static void main( String[] args )
    {

        for (int i = 1; i <= 100; i++) {
            System.out.println(FizzBuzz(i));
        }
    }
}
