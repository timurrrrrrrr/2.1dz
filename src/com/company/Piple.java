package com.company;

public class Piple {
    private String name ;
    private int age;
    private int height;
    private Hobby hobby;

    public Piple(String name, int age, int height,Hobby hobby ) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public Hobby getHobby() {
        return hobby;
    }
    public String getInfo(){
        return "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nHeight: " + getHeight() +
                "\nHobby: " + getHobby();
    }
}



