package com.arrays;

public class SingleDimensionArray {

    int arr[] = null;

    //create a blank array

    SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }

    }

    // Print an Array(Traversal)

    public void traverseArray() {
        try {


            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists !");
        }
    }

    //insert value in  the Array at a location
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("SuccessFully Inserted " + valueToBeInserted + " at location " + location);

            } else {
                System.out.println("This cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access Array!");
        }
    }

    //accessing an array

    public void accessCell(int cellNumber) {

        try {
            System.out.println(arr[cellNumber]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }

    }
//Search an array

    public void search(int valueToBeSearched) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToBeSearched) {
                System.out.println(valueToBeSearched + " found at " + i + " position ");
                return;
            }

        }
        System.out.println("Not found");
    }

    //Delete an item from Array
    public void deleteValueFromArray(int deletionLocation) {
        try {
            arr[deletionLocation] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("outside range can't be deleted");
        }
    }

    public static void main(String[] args) {
        System.out.println("Creaing a blank array of Size 10");
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(10);
        singleDimensionArray.traverseArray();
        System.out.println("Inserting few values in the Array");
        singleDimensionArray.insert(0, 0);
        singleDimensionArray.insert(1, 10);
        singleDimensionArray.insert(2, 20);
        singleDimensionArray.insert(3, 30);
        singleDimensionArray.insert(4, 40);
        singleDimensionArray.insert(5, 50);
        singleDimensionArray.insert(6, 60);
        singleDimensionArray.insert(7, 70);
        singleDimensionArray.insert(8, 80);
        singleDimensionArray.insert(1, 100);
        singleDimensionArray.insert(12, 120);
        singleDimensionArray.accessCell(4);
        singleDimensionArray.accessCell(40);
        singleDimensionArray.search(50);
        singleDimensionArray.search(100);
        System.out.println("Before Deletion");
        singleDimensionArray.traverseArray();
        singleDimensionArray.deleteValueFromArray(4);
        System.out.println("After Deletion");
        singleDimensionArray.traverseArray();
        singleDimensionArray.deleteValueFromArray(54);
    }

}
