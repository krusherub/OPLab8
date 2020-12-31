/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPack;

import com.mycompany.lab8.Human;
import com.mycompany.lab8.Student;

/**
 *
 * @author START
 */
public class MainClass {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", 19, "KPI");
        System.out.println(ivan);
        
        System.out.println("His hobby is " +ivan.getHobby());
        
        Human petro = new Human("Petro", 34, "EPAM");
        petro.setHobby("chess");
        System.out.println(petro);
        System.out.println("His hobby is " +petro.getHobby()); 
        
        Student pedro = new Student();
        System.out.println(pedro);
        pedro.setHobby("swimming");
        System.out.println("His hobby is " +pedro.getHobby());
    }
}
