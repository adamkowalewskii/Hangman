package com.pack;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
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
        password = password.toLowerCase();
        System.out.println("Podaj liczbę prób jaką użytkownik ma na zgadnięcie tego hasła(max liczba to 11 inaczej było by za łatwo ;): ");
        attemps = scanner.nextInt();

        boolean flag = true;
        for(int i = 0; i < password.length(); i++){
            if(Character.isLetter(password.charAt(i)) == false){
                if(password.charAt(i) == ' '){
                }
                else {
                    flag = false;
                }
            }
        }

        if(!flag){
            System.out.println("Podane hasło zawiera cyfrę lub inny znak nie będący literą. Podaj nowe poprawne hasło!");
            AddPassword addPassword = new AddPassword();
        }

        else if(attemps > 11){
            System.out.println("Podana liczba jest większ niż 11, spróbuj ponownie!");
            AddPassword addPassword = new AddPassword();

        } else{
            String myNew = "\n"+password+"-"+ attemps;
            String textOfFile = new String(Files.readAllBytes(Paths.get("C:\\Users\\akowalewski\\IdeaProjects\\Hangman\\src\\com\\pack\\passwords.txt")));
            Files.write(Paths.get("C:\\Users\\akowalewski\\IdeaProjects\\Hangman\\src\\com\\pack\\passwords.txt"), myNew.getBytes(), StandardOpenOption.APPEND);
        }

    }
}
