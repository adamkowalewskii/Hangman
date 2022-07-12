package com.pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

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

    private void playingGame(){
        Password gamePassword = getRandomPassword();
        String value = gamePassword.getValue();
        Integer attemps = gamePassword.getAttempts();

        String hiddenPassword = "";
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) == ' ' ){
                hiddenPassword += "\t";
            }
            else{
                hiddenPassword += "_ ";
            }

        }
        //System.out.println(value + "\n" + hiddenPassword);

        while(true){
            if(attemps == 0){
                System.out.println("Niestety przegrałeś ;(");
                break;
            }
            else if(workingOnHiddenPassword(hiddenPassword) == value){
                System.out.println("Gratulacje, Wygrałeś :)");
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
