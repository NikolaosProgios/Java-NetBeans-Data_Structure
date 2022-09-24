/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erg1;

/**
 *
 * @author nikos
 */
public 
class Student
{
    private int AM;
    private String name, lastname;
    private int age;
    private char gender;
    private int apousies;
    private double vathmos;

    Student(int AM, String name, String lastname, int age, char gender, int apousies, double vathmos)
    {
        this.AM = AM;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.apousies = apousies;
        this.vathmos = vathmos;
    }

    public int getAM()    {
        return AM;
    }

    public String getName()    {
        return name;
    }

    public String getLastname()    {
        return lastname;
    }

    public int getAge()    {
        return age;
    }

    public int getApousies()    {
        return apousies;
    }

    public double getVathmos()    {
        return vathmos;
    }
	//toString

    @Override
    public String toString() {
        return "Student{" + "AM=" + AM + ", name=" + name + ", lastname=" + lastname + ", age=" + age + ", gender=" + gender + ", apousies=" + apousies + ", vathmos=" + vathmos + '}';
    }
 
}