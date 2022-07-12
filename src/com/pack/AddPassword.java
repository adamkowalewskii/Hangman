package com.pack;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AddPassword {
    private String password;
    private int attemps;

    AddPassword() throws IOException {
        aksInTerminalAndAdd();
    }

    private void aksInTerminalAndAdd() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło, które ma zostać dodane: ");
        password = scanner.nextLine();
        System.out.println("Podaj liczbę prób jaką użytkownik ma na zgadnięcie tego hasła: ");
        attemps = scanner.nextInt();

        String myNew = "\n"+password+"-"+ attemps + "-";
        String textOfFile = new String(Files.readAllBytes(Paths.get("C:\\Users\\akowalewski\\IdeaProjects\\Hangman\\src\\com\\pack\\passwords.txt")));
        Files.write(Paths.get("C:\\Users\\akowalewski\\IdeaProjects\\Hangman\\src\\com\\pack\\passwords.txt"), myNew.getBytes(), StandardOpenOption.APPEND);
    }
}
