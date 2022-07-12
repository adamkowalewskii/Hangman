package com.pack;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private int choice = 0;

    Menu() throws IOException {
        start();
        logic();
    }
    private void start(){
        System.out.println("1.Graj\n2.Dodaj Hasło do listy");
        System.out.print("Twój wybór: ");
        Scanner scanner = new Scanner(System.in);
        this.choice = scanner.nextInt();

    }

    private void logic() throws IOException {
        if(choice == 2) {
            AddPassword addPass = new AddPassword();
        }
    }

    protected Integer getChoice(){
        return this.choice;
    }

}
