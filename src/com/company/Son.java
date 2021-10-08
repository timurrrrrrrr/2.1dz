package com.company;


final class Soon extends Father {
    private String hobbi;

    public Soon(String name, int age, int rost, Hobby hobby, String profession) {
        super(name, age, rost, hobby, profession);
    }

    public String getHobbi() {
        return hobbi;
    }
    @Override
    public String getInfo(){
        return "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nHeight: " + getHeight() +
                "\nHobby: " + getHobbi()+
                "\nProfession: " + getProfession();

    }
}

