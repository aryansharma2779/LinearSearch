package main;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers=new int[10];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i]= (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(numbers));
        int value=5; int position=-1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==value)
            {
                position=i;
                break;
            }
        }
        if(position==-1)
        {
            System.out.println(value + " not found");
        }
        else
        {
            System.out.println("Value found at index " + position);
        }
    }
}
