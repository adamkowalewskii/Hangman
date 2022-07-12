package com.pack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class LoadFromFile {
    private ArrayList<String> passwords = new ArrayList<String>();
    private ArrayList<String> attemps = new ArrayList<String>();


    private String textOfFile = new String(Files.readAllBytes(Paths.get("C:\\Users\\akowalewski\\IdeaProjects\\Hangman\\src\\com\\pack\\passwords.txt")));

    public LoadFromFile() throws IOException {
    }

    public String getTextOfFile(){
        return this.textOfFile;
    }

    private void fromTextToArrays(){
        String []arr = this.textOfFile.split("\n");
        String[][] both = new String[arr.length][2];
        for(int i = 0; i < arr.length; i++) {
            both[i] = arr[i].split(" ");

        }

        for(int i = 0; i< both.length; i++){
            passwords.add(both[i][0]);
            attemps.add(both[i][1]);
        }

        }

        public ArrayList<String> getPasswords(){
            return passwords;
        }

        public ArrayList<String> getAttemps(){
            return attemps;
        }

    }
