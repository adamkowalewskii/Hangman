package com.pack;

import java.util.Scanner;

public class Menu {

    private int choice = 0;

    Menu(){}
    public void start(){
        System.out.println("1.Graj\n2.Dodaj Hasło do listy");
        System.out.print("Twój wybór: ");
        Scanner scanner = new Scanner(System.in);
        this.choice = scanner.nextInt();

    }

    protected Integer getChoice(){
        return this.choice;
    }

}
