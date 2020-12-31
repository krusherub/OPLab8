package com.mycompany.lab8;

public class Student extends Human {

    public Student(String name, int age, String university) {
        super(name, age, university);

    }

    public Student() {
        super();
    }



    @Override
    public String toString() {
        if (!(occupation.equals("somewhere"))) {
            return "Student " + name + ", who is " + age + ", studies at " + occupation + " university";
        } else {
            return "Student " + name + ", who is " + age + ", studies (or not)" + occupation;
        }
    }

}
