package Homework05.h1;

import java.util.Arrays;

public class H1_main {
    
    public static void main(String[] args) {
        int myArray[] = {1,2,3,4, 5,6};

        int hilf[] = new int [myArray.length];

        for (int i = 0;  i < myArray.length; i++ ) {
           
            hilf[i] = myArray [(myArray.length -1 -i)]; 

        }
        myArray = hilf;
        System.out.println(Arrays.toString(myArray));
    }

}
