package com.company;

public class Main {

    public static void main(String[] args) {
        Piple piple = new Piple("Mike", 95,180,Hobby.PLAY_FOOTBALL);
        Father father = new Father("John",45,170,Hobby.PLAY_CHESS,"Doctor");
        Soon soon = new Soon("Ray",18,191,Hobby.READ_BOOKS,"Student");



        System.out.println(piple.getInfo());
        System.out.println(father.getInfo());
        System.out.println(soon.getInfo());

    }
}
