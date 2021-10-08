package com.company;


public class Father extends Piple {
    private  String profession;

    public String getProfession() {
        return profession;
    }

    public Father(String name, int age, int height, Hobby hobby, String profession) {
        super(name, age, height, hobby);
        this.profession = profession;
    }

    @Override
    public String getInfo(){
        return "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nHeight: " + getHeight() +
                "\nHobby: " + getHobby()+
                "\nProfession: " + getProfession();

    }
}


