package org.example;

public class CheckAge extends getData{
    public String checkAge(int age){
        String a = (age > 15) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        return a;
    }
}
