package com.pack;

import java.util.Scanner;

public class AddPassword {
    private String password;
    private int attemps;

    AddPassword(){
    }

    private void aksInTerminal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło, które ma zostać dodane: ");
        password = scanner.nextLine();
        System.out.println("Podaj liczbę prób jaką użytkownik ma na zgadnięcie tego hasła: ");
        attemps = scanner.nextInt();

    }
}
