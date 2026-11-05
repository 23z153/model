package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean isPrime = true;
        for(int i = 2 ; i<num/2 + 1 ; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
