package com.pack;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private int choice = 0;

    Menu() throws IOException {
        start();
        logic();
    }

    Menu(boolean flag) throws IOException {

        again();
    }
    private void start(){
        System.out.println("1.Graj\n2.Dodaj Hasło do listy");
        System.out.print("Twój wybór: ");
        try {
            Scanner scanner = new Scanner(System.in);
            this.choice = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Musisz podać cyfrę - 1 lub 2");
            System.exit(0);
        }

    }

    private void logic() throws IOException {
        if(choice == 1){
            Game game = new Game();
        }
        else if(choice == 2) {
            AddPassword addPass = new AddPassword();
        }

        else{
            System.out.println("Nie poprawny input, spróbuj pownownie");
            Main main = new Main();
        }
    }

    private void again() throws IOException {
        System.out.println("\n1.Zagraj ponownie\n2.Dodaj Hasło do listy\n3.Zakończ rozgrywkę");
        System.out.print("Twój wybór: ");
        try {
            Scanner scanner = new Scanner(System.in);
            this.choice = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Musisz podać cyfrę - 1, 2 lub 3");
            System.exit(0);
        }
        if(choice == 1){
            Game game = new Game();
        }
        else if(choice == 2) {
            AddPassword addPass = new AddPassword();
        }
        else if(choice == 3){
            System.exit(0);
        }
        else{
            System.out.println("Nie poprawny input, spróbuj pownownie");
            Main main = new Main();
        }
    }


    protected Integer getChoice(){
        return this.choice;
    }

}
