package tse.lawrence;

import tse.lawrence.annotation.BuilderProperty;

public class Person
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    @BuilderProperty
    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    @BuilderProperty
    public void setName(String name)
    {
        this.name = name;
    }
}
