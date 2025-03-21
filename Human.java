package OPLab8;

import java.util.Comparator;

class Human {

    String name;
    int age;
    String occupation;
    String hobby;
    Integer count = 0;

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
        if (count.equals(0)) setHobby();
        return hobby;
    }


    @Override
    public String toString() {
        return name;
    }

    static class NameComparator implements Comparator<Human> {
        @Override
        public int compare(Human o1, Human o2) {
            return o1.name.toLowerCase().compareTo(o2.name.toLowerCase());
        }

    }

    public static Comparator getComparator() {
        Comparator comparator = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.age - o2.age;
            }
        };
        return comparator;
    }

}