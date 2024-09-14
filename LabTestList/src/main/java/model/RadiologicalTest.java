/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class RadiologicalTest extends LabTest {
    private  String plateDimention;

  public RadiologicalTest(String testTitle, 
            double cost, 
            boolean isAvailable,
            String plateDimention) {
      super(testTitle,cost,isAvailable);
      //this.testTitle= testTitle;
      //this.cost = cost;
     // this.isAvailable = isAvailable;
        this.plateDimention = plateDimention;
        
        
    }

    @Override
    public String toString() {
        return "RadiologicalTest{" + "plateDimention=" + plateDimention + '}';
    }
 public String getTitle() {
        return testTitle;
    }
    public String getPlateDimention() {
        return plateDimention;
    }

    public void setPlateDimention(String plateDimention) {
        this.plateDimention = plateDimention;
    }
  
    public String show(){
 /**
     * Get the value of show
     *
     * @return the value of show
     */
     String output = "Test Name: " + this.getTitle() + "\n<br>" 
                        + "Plate Dimention: " + this.getPlateDimention() + "\n<br>" 
                        + "Cost: " + this.getCost() + "\n<br>" 
                        + "Availability: " + this.isIsAvailable();
        return output;
    }}


