/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.labtestlist;
import model.PathologicalTest;
import model.RadiologicalTest;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class LabTestList {
   

    public static void main(String[] args) {
                System.out.println("LabTestList");
                //  new Home().setVisible(true);
                
        ArrayList<PathologicalTest> pathologicalTests = new ArrayList<>();
        ArrayList<RadiologicalTest> radiologicalTests = new ArrayList<>();
        
         PathologicalTest pTest = new PathologicalTest("CBC",400,true,"chemical");
        // System.out.println(pTest.returnLabTestInfo());
         pTest.setCost(300);
         System.out.println("The updated cost of CBC is "+pTest.getCost());
         System.out.println(pTest.show());
         pathologicalTests.add(pTest);
//
//
//
         RadiologicalTest rTest = new RadiologicalTest("X-ray",400,true,"chemical");
       //  System.out.println(rTest.returnLabTestInfo());
       System.out.println(rTest.show());
        radiologicalTests.add(rTest); 
     
       System.out.println("\nList of Pathological Tests:");
        for (PathologicalTest test : pathologicalTests) {
            System.out.println(test.show());
        }
        System.out.println("\nList of Radiological Tests:");
        for (RadiologicalTest test : radiologicalTests) {
            System.out.println(test.show());
        }
   }
}
   

