package com.hms.controller;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.hms.model.PathologicalTest;


/**
 *
 * @author ASUS
 */
public class PathologicalTestController {
    
private PathologicalTest pTest;
/**
     * Initializes a new PathologicalTest with the given parameters.
     * 
     * @param title       The title of the test
     * @param reagent     The reagent used for the test
     * @param cost        The cost of the test
     * @param isAvailable The availability of the test
     */
    public void initializePathologicalTest(String title,String reagent ,double cost,boolean isAvailable){
        pTest = new PathologicalTest(title,cost,isAvailable,reagent);
    }
     /**
     * Returns information about the initialized PathologicalTest.
     * 
     * @return  A string with the test information, or an error message if the test is not initialized
     */
//   public String returnLabTestInfo(){
//         String pTestInfo = pTest.show();
//         return pTestInfo;
//   }
//   

   
   public String returnLabTestInfo() {
        if (pTest == null) {
            return "Pathological Test is not initialized.";
        }
        return pTest.show(); // Directly return the output of show() method
    }
}





