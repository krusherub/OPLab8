/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPLab8;
import java.util.Comparator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author START
 */
public class MainClass {
    public static void main(String[] args) {
        Human sasha = new Human("Sasha",18,"KPI");
        Human vitaliy = new Human("VITALIY",23,"KPI");
        Human ivan = new Human("Ivan",20,"KPI");

        TreeSet<Human> list1 = new TreeSet<>(Human.getComparator());

        list1.add(ivan);
        list1.add(sasha);
        list1.add(vitaliy);
        System.out.println(list1);
        //k

        ArrayList<Human> list2 = new ArrayList<>();
        list2.add(sasha);
        list2.add(ivan);
        list2.add(vitaliy);

        Collections.sort(list2, new Human.NameComparator());


        System.out.println(list2);
    }
}
