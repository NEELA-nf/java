package controller;

public class arrayVScollectionController {

    int aioIndex ,aosindex, aooIndex;
    int sizeOFArray = 1;

    int[] arrayOfIntegers;

    public void defineSizeOfarray(int size) {
        int sizeOfarray = size;
       int[] arrayOfIntegers = new int[5];
       // int value;

    }

    public void addInteger ( int testInteger){
        arrayOfIntegers[aioIndex] = testInteger;
        aioIndex++;
    }
    public void showarrayOfIntegers() {

        for(int i = 0; i < aioIndex; ++i) {

            System.out.print(arrayOfIntegers[i] + " ");

        }

        System.out.println();

    }

}

