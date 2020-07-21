package Lesson9;

public class BoubleSort {

    public static void main(String[] args) {

        int i,j,temp = 0;

        int [] array  = new int[] {1,4,5,3,76,12,6};


        for (i= 0; i<array.length-1; i++){
            for (j = 0; j< array.length - 1- i; j++){

                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    }

