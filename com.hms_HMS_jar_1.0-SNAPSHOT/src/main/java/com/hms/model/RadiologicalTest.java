/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author ASUS
 */
public class RadiologicalTest extends LabTest{
     
  private  String plateDimention;

  public RadiologicalTest(String testTitle, 
            double cost, 
            boolean isAvailable,
            String plateDimention) {
      super(testTitle,cost,isAvailable);
      this.testTitle= testTitle;
      this.cost = cost;
      this.isAvailable = isAvailable;
        this.plateDimention = plateDimention;
        
        
    }
  @Override
   public String returnLabTestInfo(){
       String output = "Test Name: " + this.getTitle() + "\n<br>" 
                        + "Cost: " + this.getCost() + "\n<br>" 
                        + "Plate Dimention: " + this.getPlateDimention() + "\n<br>" // Corrected the method call
                        + "Availability: " + this.isIsAvailable();
      return output;
   }
   /**
     * @return the plateDimention
     */
    public String getPlateDimention() {
        return plateDimention;
    }

    /**
     * @param plateDimention the plateDimention to set
     */
    public void setPlateDimention(String plateDimention) {
        this.plateDimention = plateDimention;
    }
     public String show() {
         String output = "Test Name: " + this.getTitle() + "\n<br>" 
                        + "Plate Dimention: " + this.getPlateDimention() + "\n<br>" 
                        + "Cost: " + this.getCost() + "\n<br>" 
                        + "Availability: " + this.isIsAvailable();
        return output;
    }
}