package src.arrayList;

import java.util.*;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {
        // Write your code here
        int leftIndex = 0, rightIndex = arr.length - 1;
        int temp;
        while (leftIndex < rightIndex) {
            temp = arr[leftIndex];
            arr[leftIndex++] = arr[rightIndex];
            arr[rightIndex--] = temp;
        }
    }
}
