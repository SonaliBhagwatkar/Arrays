package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num =1;
              do{
            if((num%2==0) && (num%7 == 0))
            System.out.print(num+" ");
            num++;
        } while (num<=1000);
    }
}
