package com.arrays;

import java.util.Scanner;

public class MaxIteminArray {
    public static void main(String[] args) {
        int arr[] = takeInput();

        display(arr);

        System.out.println("Max of array is" + findMax(arr));

        increment(arr);

    }

    private static void increment(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }

        System.out.println("Arrays after increment are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    public static int[] takeInput() {
        int input[] = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            input[i] = scanner.nextInt();
        }

        return input;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
