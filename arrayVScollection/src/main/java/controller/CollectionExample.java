package controller;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class CollectionExample{
   private List<String>stringList = new ArrayList<>() ;

   public void addString(String testString) {
       stringList.add(testString);

   }

    public void showString() {
        for (String value: stringList) {
            System.out.print(value);
            System.out.print(", ");
        }
        System.out.println();
    }
    //private List<String>stringList = new ArrayList<>();
    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        example.addString("Test1");
        example.addString("Test2");
        example.addString("Test3");

        example.showString(); // Outputs: Test1, Test2, Test3,
    }
}

