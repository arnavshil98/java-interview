package org.example;

// finding peak element
public class ArrayManipulation1 {
    public static void main(String[] args) {
        int[] a = {5, 10, 20, 15};
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}

