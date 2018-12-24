package com.stackroute;

public class MemberVariable
{
    String name;
    int age;
    float salary;
    MemberVariable(String name,int age,float salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public boolean display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        return true;
    }
}