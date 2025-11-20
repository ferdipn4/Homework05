package Homework05.h3;

import java.util.Arrays;

public class H3_main {
    public static void main(String[] args) {
        int[][] einheit = {
            {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
            new int[15]
        };
        int input=6279;
        if (input <=0){
            System.out.println("Ungültiger Betrag");
        }
        
        
        if (input > 0){
            for (int i =0; i < einheit[0].length; i++){
                while (input >= einheit[0][i]){
                    einheit[1][i] +=1;
                    input -= einheit[0][i];
                }
            }
        }
    }
}
