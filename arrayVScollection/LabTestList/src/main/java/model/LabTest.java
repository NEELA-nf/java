/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class LabTest {
   protected String testTitle;
   protected double cost;
   protected boolean isAvailable;
   
   public  LabTest() {}

    public LabTest(String testTitle, double cost, boolean isAvailable) {
        this.testTitle = testTitle;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }
   
//       parameterized constructor
//public LabTest(String testTitle,
//        double cost, 
//        boolean isAvailable){
//    
//     this.testTitle= testTitle;
//        this.cost = cost;
//        this.isAvailable = isAvailable;
//        
//}
//@Override
   public String toString(){
       return "LabTest{" +"testTitle" + testTitle +", cost=" + cost + ", isAvailable="
+ isAvailable + '}';
       
   }

    public String getTestTitle() {
        return testTitle;
    }

    public void setTestTitle(String testTitle) {
        this.testTitle = testTitle;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    }

