/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystackg;

/**
 *
 * @author nikos
 */
public 
class Student{
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

    public int getAM()    {        return AM;    }

    public String getName()    {        return name;    }

    public String getLastname()    {        return lastname;    }

    public int getAge()    {        return age;    }
    
    public int getApousies()    {        return apousies;    }

    public double getVathmos()
    {
        return vathmos;
    }
}
