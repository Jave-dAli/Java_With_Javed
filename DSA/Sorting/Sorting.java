package Sorting;

import java.util.Arrays;

public class Sorting {
    private void swap(int[] array, int idx1, int idx2){
        var temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
    public void bubbleSort(int[] array){
        boolean isSorted;
        for(var i=0; i<array.length; i++){
            isSorted = true;
            for(var j=1; j<array.length; j++)
                if(array[j] < array[j-1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
            if(isSorted)
                return;
        }
    }
    public void selectionSort(int[] array){
        for(var i = 0; i<array.length; i++){
            var minIndex = i;
            for(var j=i; j<array.length; j++)
                if(array[j] < array[minIndex])
                    minIndex = j;
            swap(array, minIndex, i);

        }
    }
    public void insertionSort(int[] array){
        for(var i=1; i<array.length; i++){
            var current = array[i];
            var j= i-1;
            while(j>=0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    public void mergeSort(int[] array){
        if(array.length < 2)
            return;
        var middle = array.length/2;    // Divide this array into half

        int[] left = new int[middle];
        for(var i=0; i<middle; i++)
            left[i] = array[i];

        int[] right = new int[array.length-middle];
        for(var i=middle; i<array.length; i++)
            right[i-middle] = array[i];

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }
    private void merge(int[] left, int[] right, int[] result){
        int i=0, j=0, k=0;
        while(i<left.length && j<right.length){
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while(i<left.length)
            result[k++] = left[i++];
        while(j<right.length)
            result[k++] = right[j++];
    }
    public void quickSort(int[] array, int start, int end){
        if(start >= end)
            return;

        var boundary = partition(array, start, end);

        quickSort(array, start, boundary-1);
        quickSort(array, boundary+1, end);
    }
    private int partition(int[] array, int start, int end){
        var pivot = array[end];
        var boundary = start-1;

        for(var i = start; i <= end; i++)
            if(array[i] <= pivot)
                swap(array, i, ++boundary);
        return boundary;
    }

    public static void main(String[] args) {
//        Sorting sorting = new Sorting();
//        int[] list = {7, 3, 5, 2, 3, 1, 5, 8};
//        sorting.quickSort(list, 0, list.length-1);
//        System.out.println(Arrays.toString(list));
        for(char letter = 'a'; letter<'z'; letter++) {

            System.out.print(letter+(int) letter);
        }

    }
}
