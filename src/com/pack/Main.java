package com.pack;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Menu{
    Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();
        //menu.start();

        LoadFromFile tmp = new LoadFromFile();

        ArrayList<Password> arr = tmp.getPasswords();
        
    }
}