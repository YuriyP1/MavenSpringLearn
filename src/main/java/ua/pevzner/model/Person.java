package ua.pevzner.model;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person (int id, String name, int age){
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    public String toString (){
        return "name: "+name+" id "+id;
    }
}
