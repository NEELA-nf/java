/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class PathologicalTest  extends LabTest {
private String reagent;

 
    public PathologicalTest(
            String testTitle, 
            double cost, 
            boolean isAvailable,String reagent) {
        super(testTitle, cost, isAvailable);
       this.testTitle= testTitle;
        this.cost = cost;
        this.isAvailable = isAvailable;
        
        this.reagent = reagent;
    }

//    public PathologicalTest(String testTitle, 
//        double cost, boolean isAvailable, String reagent){
//        this.testTitle= testTitle;
//        this.cost = cost;
//        this.isAvailable = isAvailable;
//       
//        this.reagent = reagent;      
//    }

    public String getReagent() {
        return reagent;
    }
 public void setReagent(String reagent) {
        this.reagent = reagent;
    }

   


/**
     * @return the title
     */
    
    
   public String getTitle() {
        return testTitle;
    }
    
    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }
      /**
     * @return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }
    
 
     /** @param title the title to set
     */
    public void setTitle(String title) {
        this.testTitle = title;
    }

    

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

   

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public String show() {
        
      
    //   return "PathologicalTest{" + "reagent=" + reagent + '}';
   //    super.toString()+reagent;
    //   return  super.toString()+reagent;

        return super.toString() + "\n" + reagent;
    }
}
    
    
    

