package com.arrays;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int arr[] = takeInput();

        display(arr);
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
