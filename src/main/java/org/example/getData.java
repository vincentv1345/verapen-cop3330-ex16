package org.example;
import java.util.Scanner;
public class getData {
    public int getAge(){
        System.out.println("What is your age? ");
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();
        return age;
    }
}
