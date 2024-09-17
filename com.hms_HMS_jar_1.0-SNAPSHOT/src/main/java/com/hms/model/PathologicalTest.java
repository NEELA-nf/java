/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author ASUS
 */
public class PathologicalTest extends LabTest { 
private String reagent;


//public class PathologicalTest(
//    
//    
//    private String testTitle;
//    private double cost;
//    private boolean isAvailable;
//    private String testType;
//    private String reaagent;
//  //  public PathologicalTest() {
//        
//   // }
   public PathologicalTest(String testTitle, 
        double cost, boolean isAvailable, String reagent){
        this.testTitle= testTitle;
        this.cost = cost;
        this.isAvailable = isAvailable;
//       super(testTitle, cost, isAvailable);
        this.reagent = reagent;
        
    }
   
//    public String show() {
//        return String.format("Test Title: %s\nCost: %.2f\nAvailable: %s\nTest Type: %s",
//                testTitle, cost, isAvailable ? "Yes" : "No", testType);
//    }
//  public String returnLabTestInfo(){
//       String output = this.testTitle + this.cost +
//               "This name: "+"\n<br>"             
//               + "cost: "+"\n<br>"
//               +"Availability: "+this.isIsAvailable();
//      return output;
//   }
   @Override
    public String returnLabTestInfo() {
        return "Test Name: " + getTitle() + "\nReagent: " + reagent + "\nCost: " + getCost() + "\nAvailable: " + isIsAvailable();
    }

// public String returnrLabTestInfo() {
//        String output = "This Name: " + this.getTitle() + "\n<br>" + "Reagent Name: " + this.getReagent() + "\n<br>" + "Cost: " + this.getCost() + "\n<br>" + "Availability: " + this.isIsAvailable();
//        return output;
//    }

           
   
//
//   
//
//    /**
//     * @return the title
//     */
// public String getReagent() {
//        return reagent;
//    }
// public void setReagent(String reagent) {
//        this.reagent = reagent;
//    }
//
//   
//public void search(String testTitle) {
//        if (this.getTitle() == testTitle) {
//            returnrLabTestInfo();
//        } else {
//            System.out.println("Not Found");
//        }
//
//    }
//
///**
//     * @return the title
//     */
//    
//    
//   public String getTitle() {
//        return testTitle;
//    }
//    
//    /**
//     * @return the cost
//     */
//    public double getCost() {
//        return cost;
//    }
//      /**
//     * @return the isAvailable
//     */
//    public boolean isIsAvailable() {
//        return isAvailable;
//    }
//    
// 
//     /** @param title the title to set
//     */
//    public void setTitle(String title) {
//        this.testTitle = title;
//    }
//
//    
//
//    /**
//     * @param cost the cost to set
//     */
//    public void setCost(double cost) {
//        this.cost = cost;
//    }
//
//   
//
//    /**
//     * @param isAvailable the isAvailable to set
//     */
//    public void setIsAvailable(boolean isAvailable) {
//        this.isAvailable = isAvailable;
//    }
    public String show() {
       // return "PathologicalTest{" + "reagent=" + reagent + '}';
//        super.toString()+reagent;
//        return  super.toString()+reagent;

        return super.toString() + "\n" + reagent;
    }
    
    // Getter and Setter for reagent
    public String getReagent() {
        return reagent;
    }

    public void setReagent(String reagent) {
        this.reagent = reagent;
    }
}
