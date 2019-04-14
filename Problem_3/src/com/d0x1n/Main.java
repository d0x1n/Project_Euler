// https://projecteuler.net/problem=3
//
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

package com.d0x1n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long num;
        long startTime;
        long endTime;
        long executionTime;
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        num = scanner.nextLong();
        System.out.println("Performing calculations...");

        startTime = new Date().getTime();
        calcPrimeNums(num, primeNumbers); // perform calculations to find prime numbers
        endTime = new Date().getTime();

        executionTime = (endTime - startTime)/1000;

        System.out.println("Largest prime factor is: " + Collections.max(primeNumbers) +
                "\nExecution time: " + executionTime + " s");
    }

    // calculate prime numbers and add them to list
    public static void calcPrimeNums(long j, ArrayList<Integer> primeNum){
        int i = 2;
        while (i > 1) {
            if ((j % i) == 0) {
                primeNum.add(i);
                j /= i;
            } else {
                i++;
            }
        }
    }
}
