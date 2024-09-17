/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author ASUS
 */
public abstract class LabTest {
    protected String testTitle;
   protected double cost;
   protected boolean isAvailable;
   
   public  LabTest() {}
   
//       parameterized constructor
public LabTest(String testTitle,
        double cost, 
        boolean isAvailable){
    
     this.testTitle= testTitle;
        this.cost = cost;
        this.isAvailable = isAvailable;
        
}
public abstract String returnLabTestInfo();
//@Override
//   public String toString(){
//       return "LabTest{" +"testTitle" + testTitle +", cost=" + cost + ", isAvailable="
//+ isAvailable + '}';
//   }

    /**
     *
     * @return
     */
//    public String returnLabTestInfo() {
//        String output = "Test Name: " + this.getTitle() + "\n"+  "Cost: " + this.getCost() + "\n"
//                + "Availability: " + this.isIsAvailable();
//        return output;
//    }
    
public String getTitle() {
        return testTitle;
    }

    public void setTitle(String testTitle) {
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
    
     // Override toString method
    @Override
    public String toString() {
        return "LabTest{" +
                "testTitle='" + testTitle + '\'' +
                ", cost=" + cost +
                ", isAvailable=" + isAvailable +
                '}';
    
    
//@Override
//   public String toString(){
//       return "LabTest{" +"testTitle" + testTitle +", cost=" + cost + ", isAvailable="
//+ isAvailable + '}';
//   }
    }}

