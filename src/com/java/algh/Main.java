package com.java.algh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a ={8,7,2,1,0,9,6};
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(a));

        int size =a.length;
        quicksort(a,0,size-1);

        System.out.println("Sorted Array im ascending order: ");
        System.out.println(Arrays.toString(a));

    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {

        if(lowIndex >=highIndex){
            return;
        }
        //alegerea unui pivot
        int pivot = array[highIndex];

        //patitia, mutarea elem mai mici decat pivotul in stanga si a celor mai
        //mari in dreapta
        //declaram leftpointer si rightpointer
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // quicksort of subarrays
        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        quicksort(array, lowIndex,leftPointer-1);
        quicksort(array, leftPointer+1, highIndex);
    }

    //metoda ce contine cele doua elemente pe care dorim sa le inversam
    private static void swap(int[] array, int index1, int index2) {
        //variabila temporara pentru a pastra variabila pe care dorim sa o schimbam
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
