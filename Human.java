package com.mycompany.lab8;

public class Human {

    String name;
    int age;
    String occupation;
    String hobby;
    Integer count =0;
    public Human(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public Human() {
        name = "Some ukrainian";
        age = 2;
        occupation = "somewhere";
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
        count++;
    }
    public void setHobby() {
        this.hobby = "some fascinating ACTIVITY";
    }

    public String getHobby() {
        if(count.equals(0) ) setHobby();
        return hobby;
    }

    @Override
    public String toString() {
        if (!(occupation.equals("somewhere"))) {
            return "Human " + name + ", who is " + age + ", works at/in " + occupation;
        } else {
            return "Human " + name + ", who is " + age + ", works " + occupation;
        }
    }

}
