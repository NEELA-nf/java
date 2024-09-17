package com.hms.controller;



import com.hms.model.PathologicalTest;
import com.hms.model.RadiologicalTest;
import com.hms.view.Home;
import com.hms.view.LogInPage;
//import com.hms.view.NewPathologicalTest;

/**
 *
 * @author ASUS
 */
public class HMS {
public static void main(String[] args) {
        System.out.println("Showing the home page!");
  
      
////      new Home().setVisible(true);
////         PathologicalTest pTest = new PathologicalTest("CBC",400,true,"chemical");
////         System.out.println(pTest.returnLabTestInfo());
////         pTest.setCost(300);
////         System.out.println("The updated cost of CBC is "+pTest.getCost());
////         System.out.println(pTest.show());
//////
//////
//////
////         RadiologicalTest rTest = new RadiologicalTest("X-ray",400,true,"chemical");
////         System.out.println(rTest.returnLabTestInfo());
//         
         new LogInPage().setVisible(true);
   }
}
                
         
    


 