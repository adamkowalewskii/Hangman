package com.pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private ArrayList<Password> passwords = new ArrayList<Password>();

    Game() throws IOException {
        LoadFromFile loadFromFile = new LoadFromFile();
        this.passwords = loadFromFile.getPasswords();

        playingGame();

    }

    public Password getRandomPassword(){
        Random rand = new Random();
        int idx = rand.nextInt(passwords.size());

        return passwords.get(idx);
    }

    private void playingGame() throws IOException {
        Password gamePassword = getRandomPassword();
        String value = gamePassword.getValue();
        Integer attemps = gamePassword.getAttempts();
        Integer drawAttemps = attemps;
        ArrayList<Character> usedletter = new ArrayList<>();
        Integer misses = 0;

        String hiddenPassword = "";
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) == ' ' ){
                hiddenPassword += "\t";
            }
            else{
                hiddenPassword += "_";
            }

        }

        while(true){
            System.out.println("\n==================\n");
            Draw draw = new Draw(misses, drawAttemps);
            System.out.println("Liczba prób: " + attemps);
            System.out.println(hiddenPassword);
            if(attemps == 0){
                System.out.println("Niestety przegrałeś ;( - Hasło to: " + value);
                break;
            }
            else if(workingOnHiddenPassword(hiddenPassword).equals(value)){
                System.out.println("Gratulacje, Wygrałeś :)");
                break;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Spróbuj zgadnąć literę: ");
            char letter = scanner.next().charAt(0);
            if(usedletter.contains(letter)){
                System.out.println("Już próbowałeś tej litery, spróbuj z jakąś inną");
            }
            else {
                usedletter.add(letter);
                boolean flag = false;
                for (int i = 0; i < value.length(); i++) {
                    if (value.charAt(i) == letter) {
                        //System.out.println("Trafiłeś");
                        flag = true;
                        hiddenPassword = workingOnHiddenPassword(hiddenPassword);

//                        for (int j = 0; j < value.length(); j++) {
//                            if (value.charAt(j) == ' ') {
//                                char hiddenPasswordChars2[] = hiddenPassword.toCharArray();
//                                hiddenPasswordChars2[j] = '\t';
//                                hiddenPassword = String.valueOf(hiddenPasswordChars2);
//                            }
//                        }

                        char hiddenPasswordChars[] = hiddenPassword.toCharArray();
                        hiddenPasswordChars[i] = letter;
                        hiddenPassword = String.valueOf(hiddenPasswordChars);

                    }
                    else{
                        for (int j = 0; j < value.length(); j++) {
                            if (value.charAt(j) == ' ') {
                                char hiddenPasswordChars2[] = hiddenPassword.toCharArray();
                                hiddenPasswordChars2[j] = '\t';
                                hiddenPassword = String.valueOf(hiddenPasswordChars2);
                            }
                        }
                    }

                }
                if (!flag) {
                    System.out.println("Pudło!");
                    attemps--;
                    misses++;

                } else {
                    System.out.println("Trafiłeś!");
                }
                flag = false;

                for (int i = 0; i < value.length(); i++) {
                    if (value.charAt(i) == ' ') {
                        char hiddenPasswordChars2[] = hiddenPassword.toCharArray();
                        hiddenPasswordChars2[i] = '\t';
                        hiddenPassword = String.valueOf(hiddenPasswordChars2);
                    }
                }
            }
        }
    }

    private String workingOnHiddenPassword(String hiddenPassword){
        String newString = "";

        for(int i = 0; i < hiddenPassword.length(); i++){

            if(hiddenPassword.charAt(i) == ' '){
                continue;
            }
            else if(hiddenPassword.charAt(i) == '\t'){
                newString += " ";
            }
            else{
                newString += hiddenPassword.charAt(i);
            }

        }
        return newString;
    }

}
