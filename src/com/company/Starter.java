package com.company;

import java.util.Scanner;

public class Starter {

    public void getDataFromConsole(){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Type your action 🤑: ");
        System.out.println(scanner.nextInt());
    }

    public void printMenu(){
        System.out.println("Hello! What do you want?");
        System.out.println("1. Hire an employee.");
    }


}
