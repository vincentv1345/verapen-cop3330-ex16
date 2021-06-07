package org.example;

/**
 * Hello world!
 *
 */
public class TestDrivingAge
{
    public static void main( String[] args )
    {
        CheckAge a = new CheckAge();
        int age = a.getAge();
        String check = a.checkAge(age);
        System.out.println(check);
    }
}
