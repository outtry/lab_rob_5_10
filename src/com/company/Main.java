package com.company;

public class Main {

    public static void main(String[] args) {
        // Варіант for
        for(int i = 500; i <= 650; i = i + 10) {
        System.out.print(i + " ");
        }

        // Варіант while
        int i = 500;
        while (i <= 650) {
            System.out.println(i + " ");
            i = i + 10;
        }


        //Варіант do - while
        int i = 500;
        do {
            System.out.println(i);
            i = i + 10;
        } while (i <= 650);

    }
}
