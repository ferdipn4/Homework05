package Homework05.h2;

public class H2_main {

    public static void main(String[] args) {
        int digits = 0;
        int n =200;
        int a[] = {0,0,0,0,0,0,0,0,0};

        int temp = Math.abs(n);
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }
        
        
    for (int i = 8; i >= 0; i--){
        if (digits >0){
            a[i] = n % 10;
            n = n / 10;
            digits--;
        } else {
            a[i] = 0;
        }
    }
    
    for (int i =0; i < 9; i++){
        System.out.print(a[i] + " ");
        
    }
}

}

