/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.minhthu.th3;

/**
 *
 * @author admin
 */
public class TH3 {

    public static void main(String[] args) {
       Ellipse e1 = new Ellipse(55, 45);
       Ellipse e2 = new Circle(56);
       
        System.out.println(e1);
        System.out.println(e2);
    
        try {
           TamGiac t1 = new TamGiac(30, 40, 50);
           TamGiac t2 = new TamGiacCan(40, 50);
           
           System.out.println(t1);
           System.out.println(t2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
