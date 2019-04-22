package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] random = {"Sonu", "Abhi", "Shreyu"};
        printArray(random);
    }

    public  static void printArray(String[] arr){
        for(String n: arr){
            System.out.println(n);
        }
    }
}
