package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 so: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + "not is prime");
        }else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " is a prime");
            }else  {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
