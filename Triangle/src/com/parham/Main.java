package com.parham;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int x = scanner.nextInt();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + "\n\n\n");

        int p = x;
        for (int i=0; i <= x; i++){
            for (int k=p; k>=0; k--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("* ");
//                System.out.println("* ");
            }
            System.out.println();
            p--;
        }
    }
}
