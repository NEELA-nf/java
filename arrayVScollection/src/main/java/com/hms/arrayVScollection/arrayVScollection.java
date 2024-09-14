package com.hms.arrayVScollection;

import controller.arrayVScollectionController;

import java.util.Scanner;

public class arrayVScollection {
    public static void  main(String[] args){
        System.out.println("Array  VS list!");
         Scanner in = new Scanner(System.in);
        arrayVScollectionController f = new  arrayVScollectionController();
        System.out.println("NO. of values needed");
        int noOFValues = in.nextInt();

        f.defineSizeOfarray(noOFValues);

        for(int i=0; i<noOFValues; i++)
            f.addInteger(in.nextInt());
        f.showarrayOfIntegers();
    }
}
