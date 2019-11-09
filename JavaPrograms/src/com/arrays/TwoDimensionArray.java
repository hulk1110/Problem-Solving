package com.arrays;

public class TwoDimensionArray {

    int arr[][] = null;

    // creating a two d array
    TwoDimensionArray(int row, int col) {
        this.arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //traversal of the array
    public void traversalArray() {
        try {
            System.out.println("Print the array");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.println(arr[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("Array does not exists");
        }
    }

    //inserting item in array

    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted " + value + "in the array.");
            } else {
                System.out.println("Already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    // accessing a sigle value
    public void access(int row, int col) {
        try {

            System.out.println("Cell value is " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }

    // deleting a single value
    public void delete(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
        } catch (
                ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }

    }

    //searching single value

    public void search(int val) {
//        System.out.println("what is the value of arr.length" + arr.length);
//        System.out.println("what is the value of arr[0].length" + arr[0].length);
//        System.out.println("what is the value of arr[1].length" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == val) {
                    System.out.println("value is found at " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("not found");
    }


    public static void main(String[] args) {
        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(5, 5);
        twoDimensionArray.traversalArray();
        twoDimensionArray.insertValueInTheArray(0, 0, 10);
        twoDimensionArray.insertValueInTheArray(0, 1, 20);
        twoDimensionArray.insertValueInTheArray(0, 2, 30);
        twoDimensionArray.insertValueInTheArray(0, 3, 40);
        twoDimensionArray.insertValueInTheArray(0, 4, 50);
        twoDimensionArray.insertValueInTheArray(1, 0, 70);
        twoDimensionArray.insertValueInTheArray(1, 0, 80);
        twoDimensionArray.access(0, 4);
        twoDimensionArray.access(0, 5);
        twoDimensionArray.search(70);
        twoDimensionArray.search(89);
        System.out.println("Before deletion");
        twoDimensionArray.traversalArray();
        twoDimensionArray.delete(0, 1);
        System.out.println("After Deletion");
        twoDimensionArray.traversalArray();

    }
}
